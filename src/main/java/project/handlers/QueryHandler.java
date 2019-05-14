package project.handlers;

import org.springframework.stereotype.Repository;
import project.entities.Activity;

import java.util.List;

//@Repository
public interface QueryHandler {
    void setNext(QueryHandler queryHandler);
    List<Activity> handleQuery(Query query);
}
