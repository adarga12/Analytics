package com.adarga.domain;

import org.joda.time.DateTime;

/**
 * Created by cbolton on 6/9/17.
 */
public class Metric {

    private Goal goal;
    private DateTime timestamp;

    public Metric() {}

    public Metric (Goal goal, float progress) {
        this.goal = goal;
        this.progress = progress;
        timestamp = DateTime.now();
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    private float progress;

    public float getProgress() {
        return progress;
    }

    public Goal getGoal() {
        return goal;
    }


}
