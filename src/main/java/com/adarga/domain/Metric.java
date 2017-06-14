package com.adarga.domain;

import org.joda.time.DateTime;

/**
 * Represents an entry describing progress towards a Goal.
 * Created by cbolton on 6/9/17.
 */
public class Metric {

    private int goalId;
    //TODO: Consider a lighterweight alternative to DateTime.
    private DateTime timestamp;


    public Metric(int goalId) {
        this.goalId = goalId;
    }

    public Metric (int goalId, float progress) {
        this.progress = progress;
        timestamp = DateTime.now();
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    private float progress;

    public float getProgress() {
        return progress;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

}
