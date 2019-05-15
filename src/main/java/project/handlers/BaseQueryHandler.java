package project.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import project.entities.Activity;

import java.util.List;

//@Repository("base")
public class BaseQueryHandler implements QueryHandler{
    protected QueryHandler next;

//    @Autowired
//    @Qualifier("cache")
    public void setNext(QueryHandler queryHandler) {
        if (next == null) {
            next = queryHandler;
        } else {
            next.setNext(queryHandler);
        }
    }

    public List<Activity> handleQuery(Query query) {
//      return next.handleQuery(query);
        if (next != null) {
            next.handleQuery(query);
        }
        return null;
    }
}
