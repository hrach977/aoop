package project.handlers;

import project.entities.Activity;

import java.util.List;

public class BaseQueryHandler implements QueryHandler{
    protected QueryHandler next;

    public void setNext(QueryHandler queryHandler) {
        if (next == null) {
            next = queryHandler;
        } else {
            next.setNext(queryHandler);
        }
    }

    public List<Activity> handleQuery(String address) {
        if (next!=null) {
           return next.handleQuery(address);
        }
        return null;
    }

    public List<Activity> handleQuery(Integer age) {
        if (next!=null) {
            next.handleQuery(age);
        }
        return null;
    }
}
