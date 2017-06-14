package com.adarga.data;

import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;

import java.util.ArrayList;

/**
 * Created by Chris on 6/14/2017.
 */
public interface DataStore {
    static DataStore getInstance() {
        if (InMemoryDataStore.dataStore == null) {
            InMemoryDataStore.dataStore = new DataStore();
        }
        return InMemoryDataStore.dataStore;
    }

    ArrayList<Metric> getAllMetrics();

    void addMetric(Metric m);

    Tracker getTracker();
}
