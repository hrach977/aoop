package project.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.dal.mongo.ActivityRepository;
import project.entities.Activity;

import java.util.List;


@Repository("db")
public class DbQueryHandler extends BaseQueryHandler {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> handleQuery(Query query) {

        //todo: write implementation to try handling first prior to delegating

        return super.handleQuery(query);
    }
}
