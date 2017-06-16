package com.adarga.controller;

import com.adarga.domain.Tracker;
import com.adarga.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Controller for the Averages endpoint.
 * Created by Chris on 6/16/2017.
 */
@RestController
@RequestMapping("/Averages")
public class AveragesController {

    @Autowired
    private AnalyticsService service;

    @RequestMapping(method= RequestMethod.GET)
    public float getAverage(int goalId, int period) {
        return service.getAverageSuccessRate(goalId, period);
    }


}
