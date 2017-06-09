package com.adarga.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for collection of Metrics
 * Created by cbolton on 6/9/17.
 */

@RestController
public class MetricController {

    @RequestMapping("/")
    public String index() {
        return "Hey there you!";
    }

    //GET
    //PUT
    //DELETE
    //UPDATE
}
