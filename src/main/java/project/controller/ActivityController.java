package project.controller;

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

    @Autowired
    private ActivityRepository mongoActivityRepository;
    @Autowired
    private RedisActivityRepository redisActivityRepository;

    @PostMapping("/add")
    public void addActivity(@RequestBody Activity activity) {
        System.out.println("inside activity controller");
        project.entities.redis.Activity redisActivity = new project.entities.redis.Activity(activity);
        project.entities.mongo.Activity mongoActivity = new project.entities.mongo.Activity(activity);
        redisActivityRepository.save(redisActivity);
        mongoActivityRepository.save(mongoActivity);
    }
}
