package com.adarga.data;

import com.adarga.domain.Goal;
import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

/**
 * A Singleton in memory collection of Goals and Metrics, encapsulated by a Tracker.
 * Created by cbolton on 6/9/17.
 */
@Repository
public class InMemoryDataStore implements DataStore {
    private ArrayList<Metric> metrics;
    private static DataStore dataStore;
    private Tracker tracker;
    private ArrayList<Tracker> trackers;

    private InMemoryDataStore(){
        metrics = new ArrayList<Metric>();
        initializeMetrics();
    }

    public static DataStore getInstance() {
        if (InMemoryDataStore.dataStore == null) {
            InMemoryDataStore.dataStore = new InMemoryDataStore();
        }
        return InMemoryDataStore.dataStore;
    }

    private void initializeMetrics() {
        metrics.add(new Metric(0, 5.2f));
        Goal goal = new Goal(0, 10, "Cardio", "Minutes spent on cardiovascular exercise");
        metrics.add(new Metric(0, 7.6f));
        metrics.add(new Metric(0, 8.1f));
        metrics.add(new Metric(0, 2.98f));
        tracker = new Tracker(goal, metrics);
        trackers = new ArrayList<Tracker>();
        trackers.add(tracker);
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
    public ArrayList<Tracker> getTrackers() {
        return trackers;
    }

    @Override
    public Tracker getTracker(int goalId) {
        Optional<Tracker> optional = trackers.stream().filter(t -> t.getGoal().getId() == goalId).findFirst();
        return optional.isPresent() ? optional.get() : null;
    }


}
