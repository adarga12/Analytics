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
public class InMemoryDataStore implements DataStore {
    private ArrayList<Metric> metrics;
    private static DataStore dataStore;
    private Tracker tracker;

    private InMemoryDataStore(){
        metrics = new ArrayList<Metric>();
        initializeMetrics();
    }

    private void initializeMetrics() {
        metrics.add(new Metric(5.2f));
        Goal goal = new Goal(10, "Cardio", "Minutes spent on cardiovascular exercise");
        metrics.add(new Metric(7.6f));
        metrics.add(new Metric(8.1f));
        metrics.add(new Metric(2.98f));
        tracker = new Tracker(goal, metrics);
    }

    @Override
    public ArrayList<Metric>getAllMetrics() {
        return metrics;
    }

    @Override
    public void addMetric(Metric m) {
        metrics.add(m);
    }

    @Override
    public Tracker getTracker() {
        return tracker;
    }
}
