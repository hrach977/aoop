package project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import project.handlers.BaseQueryHandler;
import project.handlers.CacheQueryHandler;
import project.handlers.DbQueryHandler;
import project.handlers.QueryHandler;
import project.suggestions.Suggestor;
import project.suggestions.SuggestorByAddress;
import project.suggestions.SuggestorByAge;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    @Autowired
    CacheQueryHandler cacheQueryHandler;

    @Autowired
    DbQueryHandler dbQueryHandler;

    @Bean
    public Map<String, Suggestor> getSuggestors() {
        return new HashMap<String, Suggestor>(){{
//            put("age", getSuggestorByAge());
//            put("address", getSuggetorByAddress());
//            put("schedule", getSuggestorBySchedule());
            put("age", new SuggestorByAge());
            put("address", new SuggestorByAddress());
        }};
    }

//    @Bean
//    @Order(0)
//    public Suggestor getSuggestorByAge() {
//        return new SuggestorByAge();
//    }
//
//    @Bean
//    @Order(1)
//    Suggestor getSuggetorByAddress() {
//        return new SuggestorByAddress();
//    }
//
//    @Bean
//    @Order(2)
//    public Suggestor getSuggestorBySchedule() {
//        return new SuggestorByAddress();
//    }

    @Bean("base")
    public BaseQueryHandler getQueryHandler() {
        BaseQueryHandler baseQueryHandler = new BaseQueryHandler();
        baseQueryHandler.setNext(cacheQueryHandler);
        baseQueryHandler.setNext(dbQueryHandler);
        return baseQueryHandler;
    }
}
