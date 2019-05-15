package project.suggestions;

import project.entities.Activity;
import project.handlers.Query;
import project.handlers.QueryHandler;

import java.util.List;

public interface Suggestor {
    List<Activity> suggest(Query query, QueryHandler queryHandler);
}
