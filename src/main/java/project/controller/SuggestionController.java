package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.entities.Activity;
import project.services.SuggestionService;

@RestController
@RequestMapping("/suggestions")
public class SuggestionController {

    private SuggestionService suggestionService;

    @Autowired
    public void set(SuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

    @GetMapping("/suggest")
    public Activity getSuggestion(@RequestParam(required = false) String by) {
        return new Activity();
    }
}
