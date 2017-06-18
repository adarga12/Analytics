package com.adarga.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Represents an entry describing progress towards a Goal.
 * Created by cbolton on 6/9/17.
 */
public class Metric {

    //TODO: Require id in Metric constructors
    private int id;
    private int goalId;
    //TODO: Consider a lighterweight alternative to DateTime.
    private DateTime timestamp;
    private float progress;

    @JsonCreator
    public Metric (@JsonProperty("id") int id, @JsonProperty("goalId") int goalId, @JsonProperty("progress") float progress) {
        this.id = id;
        this.goalId = goalId;
        this.progress = progress;
        timestamp = DateTime.now();
    }

    public int getId() { return id; }

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
