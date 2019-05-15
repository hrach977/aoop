package project.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.dal.mongo.ActivityRepository;
import project.entities.Activity;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


@Repository("db")
public class DbQueryHandler extends BaseQueryHandler {
    private static final Logger log = LoggerFactory.getLogger(DbQueryHandler.class);

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> handleQuery(String address) {
        log.info("db trying to serve the request");
        List<project.entities.mongo.Activity> filtered = activityRepository.findByAddress(address);
        if (filtered == null || filtered.size() == 0) {
            log.info("db failed to serve the query");
            return super.handleQuery(address);
        }
        filtered.forEach(System.out::println);
        List<Activity> result = new LinkedList<>();//filtered.stream().map(it -> new Activity(it)).collect(Collectors.toList());
        for (project.entities.mongo.Activity a : filtered) {
            result.add(new Activity(a));
        }
        return result;
    }
}
