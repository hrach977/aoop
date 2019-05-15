package project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.entities.Activity;
import project.handlers.Query;
import project.services.SuggestionService;

import java.util.List;

@RestController
@RequestMapping("/suggestions")
public class SuggestionController {
    private static final Logger log = LoggerFactory.getLogger(SuggestionController.class);

    private SuggestionService suggestionService;

    @Autowired
    public void set(SuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

//    @GetMapping("/suggest")
//    public List<Activity> getSuggestion(@RequestParam(required = false, value = "address") String address) {
//        log.info("address is {}", address);
//        return suggestionService.suggestActivites(address);
//    }

    @GetMapping("/suggest")
    public List<Activity> getSuggestion(Query query) {
        System.out.println(query);
//        return suggestionService.suggestActivities(query);
        List<Activity> result = suggestionService.suggestActivities(query);
        System.out.println("from controller");
        System.out.println(result.size());
        result.forEach(System.out::println);
        return result;
    }
}
