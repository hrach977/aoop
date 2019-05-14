package project.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.dal.mongo.ActivityRepository;


@Repository("db")
public class DbQueryHandler extends BaseQueryHandler {

    @Autowired
    private ActivityRepository activityRepository;

}
