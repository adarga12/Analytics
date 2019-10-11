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

import java.util.ArrayList;

/**
 * Controller for collection of Records
 *
 */

@RestController
@RequestMapping("/Records")
public class RecordController {

    @Autowired
    private AnalyticsService service;

    @RequestMapping(method= RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateRecord(Record record) {
        service.updateRecord(record);
    }

    @RequestMapping(method= RequestMethod.GET)
    public ArrayList<Tracker> getRecords() {
        return service.getTrackers();
    }

    @RequestMapping(method= RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void addRecord(@RequestBody Record record) {
        service.addRecord(record);
    }

    @RequestMapping(method= RequestMethod.DELETE, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void deleteRecord(@RequestBody Record record) {
        service.deleteRecord(record);
    }}
