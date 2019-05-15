package project.suggestions;

import project.entities.Activity;
import project.handlers.Query;
import project.handlers.QueryHandler;

import java.util.List;

public class SuggestorByAddress implements Suggestor {

    @Override
    public List<Activity> suggest(Query query, QueryHandler queryHandler) {
        return queryHandler.handleQuery(query);
    }
}
