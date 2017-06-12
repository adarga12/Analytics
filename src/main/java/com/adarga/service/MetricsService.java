package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Metric;

import java.util.ArrayList;

/**
 * Created by cbolton on 6/11/17.
 */
public class MetricsService {

    public MetricsService() {}
    public class Summary {

        public Summary() {}
    };

    public ArrayList<Metric> getAllMetrics() {
        return DataStore.getInstance().getAllMetrics();
    }
    public Summary getSummary(ArrayList<Metric> metrics) {
        return new Summary();
    }

    public void addMetric(Metric m) {
        DataStore.getInstance().addMetric(m);
    }



}
