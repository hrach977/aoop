package project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import project.dal.mongo.ActivityRepository;
import project.dal.redis.RedisActivityRepository;
import project.entities.mongo.Activity;

import java.util.List;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableRedisRepositories
public class Application implements CommandLineRunner {

    @Autowired
    ActivityRepository repo;

    @Autowired
    RedisActivityRepository redisRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        this.organizationName = organizationName;
//        this.startTime = startTime;
//        this.endTime = endTime;
//        this.address = address;
//        this.ageThreshold = ageThreshold;
    }

    @Override
    public void run(String... args) throws Exception {
//        Activity activity = new Activity("anun", "zal", 123L, 321L, "komitas", 21);
//        repo.save(activity);
//        Activity res = repo.findOne();
//
//        List<Activity> res = repo.findByAddress("komitas");
//        project.entities.Activity real = new project.entities.Activity(res.get(0));
//        System.out.println("From MONGO");
//        System.out.println(real);

//        project.entities.redis.Activity redActivity = new project.entities.redis.Activity("anun", "zal", 123L, 321L, "komitas", 21);
//        redisRepo.save(redActivity);
//        System.out.println(redActivity);
//        List<project.entities.redis.Activity> redisRes = redisRepo.findByAddress("komitas");
//        System.out.println("redis res size " + redisRes.size());
//        project.entities.Activity redisReal = new project.entities.Activity(redisRes.get(0));
//        project.entities.redis.Activity redisRes = redisRepo.findById("5187ddda-f54c-4caa-acc1-7f19bc108e12").get();

//        List<project.entities.redis.Activity> redisAll = (List<project.entities.redis.Activity>) redisRepo.findAll();
//        System.out.println(redisAll.size());
//
//        System.out.println("From REDIS");
////        System.out.println(redisAll.get(0));
//        redisAll.forEach(System.out::println);

//        List<project.entities.redis.Activity>
        //        Activity activity = new Activity("anun", "zal", 123L, 321L, "komitas", 21);
//
//        project.entities.redis.Activity redisA = new project.entities.redis.Activity(824L, "par", "activName", 321L, 432L, "nalbandyan", 18);
//        redisRepo.save(redisA);
        System.out.println("fetching from redis");
        project.entities.redis.Activity fetchedA = redisRepo.findById(824L).get();
        System.out.println(fetchedA);

//        Activity activity = new Activity(824L, "par", "activName", 321L, 432L, "nalbandyan", 18);
//        repo.save(activity);
        System.out.println("fetching activity");
        Activity fetched = repo.findById(824L);
        System.out.println(fetched);
    }
}
