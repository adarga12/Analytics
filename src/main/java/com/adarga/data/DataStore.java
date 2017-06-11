package com.adarga.data;

import com.adarga.domain.Goal;
import com.adarga.domain.Metric;

import java.util.ArrayList;

/**
 * A Singleton collection of Metrics that can be streamed for analysis
 * Created by cbolton on 6/9/17.
 */
public class DataStore {
    private ArrayList<Metric> metrics;
    private static DataStore dataStore;

    private DataStore(){
        metrics = new ArrayList<Metric>();
        initializeMetrics();
    }

    public static DataStore getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore();
        }
        return dataStore;
    }

    private void initializeMetrics() {
        metrics.add(new Metric(new Goal(20), 5));
        Goal g = new Goal(10, "Cardio", "Minutes spent on cardiovascular exercise");
        metrics.add(new Metric(g, 7));
        metrics.add(new Metric(g, 8));
        metrics.add(new Metric(g, 2));
    }

    public ArrayList<Metric>getAllMetrics() {
        return metrics;
    }
}
