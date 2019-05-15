package project.handlers;

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

    @Autowired
    private RedisActivityRepository redisActivityRepository;

    @Autowired
    @Qualifier("db")
    public void setNext(QueryHandler queryHandler) {
        this.next = queryHandler;
    }

    @Override
    public List<Activity> handleQuery(Query query) {
        //change this according to the parameters

//        List<project.entities.redis.Activity> result = redisActivityRepository.findByAddress("asd");
//        if (result != null && result.size()!=0) {
//            List<Activity> res = new LinkedList<>();
//            for (project.entities.redis.Activity a : result) {
////                res.add(new Activity(a));
//            }
//            return res;
//        }
//
//
//        if (next != null) {
//            return next.handleQuery(query);
//        }
//        return null;
//       List<project.entities.redis.Activity> all = (List<project.entities.redis.Activity>) redisActivityRepository.findAll();
//       List<project.entities.redis.Activity> filtered = null;
//       if (query.containsAddress()) {
//           filtered = all.stream().filter(it -> query.getAddress().equals(it.getAddress())).collect(Collectors.toList());
//       } else if (query.containsAge())

       return super.handleQuery(query);
    }
}
