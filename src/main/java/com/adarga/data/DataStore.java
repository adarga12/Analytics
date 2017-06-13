package com.adarga.data;

import com.adarga.domain.Goal;
import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * A Singleton collection of Metrics that can be streamed for analysis
 * Created by cbolton on 6/9/17.
 */
@Repository
public class DataStore {
    private ArrayList<Metric> metrics;
    private static DataStore dataStore;
    private Tracker tracker;

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
        metrics.add(new Metric(5.2f));
        Goal g = new Goal(10, "Cardio", "Minutes spent on cardiovascular exercise");
        metrics.add(new Metric(7.6f));
        metrics.add(new Metric(8.1f));
        metrics.add(new Metric(2.98f));
        tracker = new Tracker(g, metrics);
    }

    public ArrayList<Metric>getAllMetrics() {
        return metrics;
    }

    public void addMetric(Metric m) {
        metrics.add(m);
    }

    public Tracker getTracker() {

        return tracker;
    }
}
