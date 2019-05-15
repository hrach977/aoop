package project.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import project.dal.redis.RedisActivityRepository;
import project.entities.Activity;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository("cache")
public class CacheQueryHandler extends BaseQueryHandler {
    private static final Logger log = LoggerFactory.getLogger(CacheQueryHandler.class);

    @Autowired
    private RedisActivityRepository redisActivityRepository;

    @Autowired
    @Qualifier("db")
    public void setNext(QueryHandler queryHandler) {
        this.next = queryHandler;
    }

    @Override
    public List<Activity> handleQuery(String address) {
        log.info("cache trying to serve the request");
        List<project.entities.redis.Activity> all = (List<project.entities.redis.Activity>) redisActivityRepository.findAll();
        all.stream().forEach(System.out::println);
        List<project.entities.redis.Activity> filtered = all.stream().filter(it -> address.equals(it.getAddress())).collect(Collectors.toList());
        if (filtered == null || filtered.size()==0) {
            log.info("cache failed serving the request");
            return super.handleQuery(address);
        }
//        List<Activity> result = filtered.stream().map(Activity::new).collect(Collectors.toList());
        List<Activity> result = new LinkedList<>();
        for (project.entities.redis.Activity a : filtered) {
            result.add(new Activity(a));
        }
        System.out.println("base entity");
        result.stream().forEach(System.out::println);
        return result;
    }

}
