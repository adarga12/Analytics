package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Implementation of the service layer of the Analytics application
 * Created by cbolton on 6/11/17.
 */
@Service
public class MetricsService {

    @Autowired
    private DataStore dataStore;
    public MetricsService() {}

    public ArrayList<Metric> getAllMetrics() {
        return dataStore.getAllMetrics();
    }

    //TODO: Need to update this to work with the Tracker object; we can't add new Trackers/Goals and new Metrics don't have timestamps.
    public void addMetric(Metric m) {
        dataStore.getTracker(m.getGoalId()).addMetric(m);
    }

    public ArrayList<Tracker> getTrackers() {
        return dataStore.getTrackers();
    }

    //TODO: Implement averaging features

}
