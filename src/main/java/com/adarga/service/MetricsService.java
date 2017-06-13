package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by cbolton on 6/11/17.
 */
@Service
public class MetricsService {

    @Autowired
    private DataStore dataStore;
    public MetricsService() {}
    public class Summary {

        public Summary() {}
    };

    public ArrayList<Metric> getAllMetrics() {
        return dataStore.getAllMetrics();
    }
    public Summary getSummary(ArrayList<Metric> metrics) {
        return new Summary();
    }

    public void addMetric(Metric m) {
        dataStore.getTracker().addMetric(m);
    }

    public Tracker getTracker() {
        return dataStore.getTracker();
    }



}
