package com.adarga.domain;

import org.joda.time.DateTime;

/**
 * Created by cbolton on 6/9/17.
 */
public class Metric {

    private DateTime timestamp;

    public Metric() {}

    public Metric (float progress) {
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
