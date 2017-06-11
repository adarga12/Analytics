package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Metric;

import java.util.ArrayList;

/**
 * Created by cbolton on 6/11/17.
 */
public class MetricsService {

    public static ArrayList<Metric> getAllMetrics() {
        return DataStore.getInstance().getAllMetrics();
    }
}
