package com.adarga.controller;

import com.adarga.domain.Goal;
import com.adarga.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Controller for collection of Goals
 * Created by cbolton on 6/14/17.
 */

@RestController
@RequestMapping("/Goals")
public class GoalController {

    @Autowired
    private AnalyticsService service;

    @RequestMapping("/PUT")
    public void updateGoal(Goal goal) throws NotImplementedException {
        //TODO: Update a goal in our collection
    }

    @RequestMapping(method= RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void addGoal(@RequestBody Goal goal) {
        service.addGoal(goal);
    }

    public void deleteGoal(@RequestBody Goal goal) {
        //TODO: Implement a delete method for deleting goals
        service.deleteGoal(goal);
    }
}
