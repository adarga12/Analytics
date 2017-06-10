package com.adarga.controller;

import com.adarga.domain.Goal;
import com.adarga.domain.Metric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Controller for collection of Metrics
 * Created by cbolton on 6/9/17.
 */

@RestController
@RequestMapping("/Metrics")
public class MetricController {

    @RequestMapping("/")
    public String index() {
        return "<html><title>Hello World</title><body><P><B>Hey there you!</B></P></body></html>";
    }

    @RequestMapping("/PUT")
    public void addMetric() {
        // Add a metric to our collection
    }

    @RequestMapping(method= RequestMethod.GET)
    public ArrayList<Metric> getMetrics() {
        ArrayList<Metric> metrics = new ArrayList<Metric>();
        metrics.add(new Metric(new Goal(10, "Cardio", "Minutes spent on cardiovascular exercise"), 7));
        return metrics;
    }
    //GET
    //PUT
    //DELETE
    //UPDATE
}
