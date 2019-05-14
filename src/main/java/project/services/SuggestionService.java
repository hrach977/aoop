package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import project.entities.Activity;
import project.handlers.BaseQueryHandler;
import project.handlers.Query;
import project.handlers.QueryHandler;
import project.suggestions.Suggestor;

import java.util.List;
import java.util.Map;

@Service
public class SuggestionService {

    private Map<String, Suggestor> suggestors;

//    @Autowired
    private BaseQueryHandler queryHandler;

    @Autowired
    public SuggestionService(Map<String, Suggestor> suggestors) {
        this.suggestors = suggestors;
    }

    @Autowired
    @Qualifier("base")
    public void setQueryHandler(BaseQueryHandler queryHandler) {
        this.queryHandler = queryHandler;
    }

    //check from the query which parameters is passed
    //and then server the query using the appropriate suggestor
    public List<Activity> suggestActivies(Query query) {
        return null;
    }

}
