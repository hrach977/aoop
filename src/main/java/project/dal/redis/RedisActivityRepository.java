package project.dal.redis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.entities.redis.Activity;

import java.util.List;

@Repository
public interface RedisActivityRepository extends CrudRepository<Activity, String> {
    List<Activity> findByAddress(String address);
    List<Activity> findByAgeThresholdGreaterThanEqual(int age);
}
