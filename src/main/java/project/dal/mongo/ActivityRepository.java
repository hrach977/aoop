package project.dal.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.entities.mongo.Activity;

import java.util.List;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {
    List<Activity> findByAddress(String address);
    List<Activity> findByAgeThresholdGreaterThanEqual(int age);
}
