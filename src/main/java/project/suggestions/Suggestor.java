package project.suggestions;

import project.entities.mongo.Activity;
import project.handlers.QueryHandler;

import java.util.List;

public interface Suggestor {
    List<Activity> suggest(QueryHandler queryHandler);
}
