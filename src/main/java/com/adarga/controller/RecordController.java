package com.adarga.controller;

import com.adarga.domain.Record;
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
 * Controller for collection of Records
 * Created by cbolton on 6/9/17.
 */

@RestController
@RequestMapping("/Records")
public class RecordController {

    @Autowired
    private AnalyticsService service;

    @RequestMapping("/")
    public String index() {
        return "<html><title>Hello World</title><body><P><B>Hey there you!</B></P></body></html>";
    }

    @RequestMapping("/PUT")
    public void updateRecord(Record record) throws NotImplementedException {
        //TODO: Update a record in our collection
    }

    @RequestMapping(method= RequestMethod.GET)
    public ArrayList<Tracker> getRecords() {
        return service.getTrackers();
    }

    @RequestMapping(method= RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void addRecord(@RequestBody Record record) {
        service.addRecord(record);
    }

    //TODO: Implement a delete method for deleting records
}
