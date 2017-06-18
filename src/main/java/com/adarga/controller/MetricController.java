package com.adarga.controller;

import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import com.adarga.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Controller for collection of Metrics
 * Created by cbolton on 6/9/17.
 */

@RestController
@RequestMapping("/Metrics")
public class MetricController {

    @Autowired
    private AnalyticsService service;
    @RequestMapping("/")
    public String index() {
        return "<html><title>Hello World</title><body><P><B>Hey there you!</B></P></body></html>";
    }

    @RequestMapping("/PUT")
    public void updateMetric(Metric m) throws NotImplementedException {
        //TODO: Update a metric in our collection
    }

    @RequestMapping(method= RequestMethod.GET)
    public ArrayList<Tracker> getMetrics() {
        return service.getTrackers();
    }

    @RequestMapping(method= RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void addMetric(@RequestBody Metric m) {
        service.addMetric(m);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteMetric(@RequestBody Metric metric) { service.deleteMetric(metric);}
}
