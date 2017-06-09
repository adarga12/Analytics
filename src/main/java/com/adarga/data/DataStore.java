package com.adarga.data;

import com.adarga.domain.Metric;

import java.util.ArrayList;

/**
 * A Singleton collection of Metrics that can be streamed for analysis
 * Created by cbolton on 6/9/17.
 */
public class DataStore {
    private ArrayList<Metric> metrics;
    private DataStore dataStore;

    private DataStore(){
        metrics = new ArrayList<Metric>();
        initializeMetrics();
    }

    public DataStore getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore();
        }
        return dataStore;
    }

    private void initializeMetrics() {
        metrics.add(new Metric());
    }
}
