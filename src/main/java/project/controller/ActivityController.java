package project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dal.mongo.ActivityRepository;
import project.dal.redis.RedisActivityRepository;
import project.entities.Activity;

@RestController
@RequestMapping("/activities")
public class ActivityController {
    private static final Logger log = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private ActivityRepository mongoActivityRepository;
    @Autowired
    private RedisActivityRepository redisActivityRepository;

    @PostMapping("/add")
    public void addActivity(@RequestBody Activity activity) {
        if (activity.getId() %2 == 0) {
            log.info("id is even, so we save into cache as well");
            project.entities.redis.Activity redisActivity = new project.entities.redis.Activity(activity);
            redisActivityRepository.save(redisActivity);
        }
        project.entities.mongo.Activity mongoActivity = new project.entities.mongo.Activity(activity);
        mongoActivityRepository.save(mongoActivity);
    }
}
