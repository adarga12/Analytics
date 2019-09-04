package com.adarga.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Represents an entry describing progress towards a Goal.
 * Created by cbolton on 6/9/17.
 */
public class Metric {

    private static long nextId = 0;

    private long id;
    private int goalId; //ID of the goal we're logging progress toward
    //TODO: Consider a lighterweight alternative to DateTime.
    private DateTime timestamp; //time of our record
    private float progress; //Progress made toward goal
    private String unitOfMeasure; //The unit of progress in time/distance/weight etc (ie, minutes, hours, miles, pounds)

    @JsonCreator
    public Metric (@JsonProperty("goalId") int goalId, @JsonProperty("progress") float progress, String unitOfMeasure, @JsonProperty("timestamp") DateTime timestamp) {
        this.id = Metric.getNextId();
        this.goalId = goalId;
        this.progress = progress;
        this.unitOfMeasure = unitOfMeasure;
        this.timestamp = timestamp == null ?  DateTime.now() : timestamp;
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

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure (String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public long getId() {
        return id;
    }

    public static long getNextId() {
        return Metric.nextId++;
    }
}
