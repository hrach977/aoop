package project.suggestions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.entities.Activity;
import project.handlers.Query;
import project.handlers.QueryHandler;

import java.util.List;

public class SuggestorByAddress implements Suggestor {
    private static final Logger log = LoggerFactory.getLogger(SuggestorByAddress.class);
    @Override
    public List<Activity> suggest(Query query, QueryHandler queryHandler) {
        log.info("suggestor by address trying to suggest");
        return queryHandler.handleQuery(query.getAddress());
    }
}
