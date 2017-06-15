package com.adarga.domain;

import java.util.ArrayList;

/**
 * Composition of a Goal and associated Metrics.
 * Created by Chris on 6/13/2017.
 */
public class Tracker {

    private Goal goal;
    private ArrayList<Metric> metrics;

    public Tracker(Goal goal) {
        this.goal = goal;
        metrics = new ArrayList<Metric>();
    }

    public Tracker(Goal goal, ArrayList<Metric> metrics) {
        this.goal = goal;
        this.metrics = metrics;
    }

    public Goal getGoal() {
        return goal;
    }

    public ArrayList<Metric> getMetrics() {
        return metrics;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public void setMetrics(ArrayList<Metric> metrics) {
        this.metrics = metrics;
    }

    public void addMetric(Metric m) {
        metrics.add(m);
    }
}
