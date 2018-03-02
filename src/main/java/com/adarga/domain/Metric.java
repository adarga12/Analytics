package com.adarga.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Represents an entry describing progress towards a Goal.
 * Created by cbolton on 6/9/17.
 */
//TODO: Should Metric be abstrtact?  Should we extract an interface?
public class Metric {

    private int goalId;
    //TODO: Consider a lighterweight alternative to DateTime.
    private DateTime timestamp;
    private float progress;

    //Default constructor for subclassing
    public Metric() {}

    @JsonCreator
    public Metric (@JsonProperty("goalId") int goalId, @JsonProperty("progress") float progress) {
        this.goalId = goalId;
        this.progress = progress;
        timestamp = DateTime.now();
    }

    public int getGoalId() {
        return goalId;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

}
