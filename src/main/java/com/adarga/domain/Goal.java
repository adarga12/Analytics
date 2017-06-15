package com.adarga.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A goal the user is trying to achieve.  Examples include miles to run, minutes to spend studying, or calories
 * to stay under.
 * Created by cbolton on 6/9/17.
 */
public class Goal {

    private final int goalId;

    public void setGoal(float goal) {
        this.goal = goal;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private float goal;
    private String title;
    private String description;

    public Goal(int goalId) {
        this.goalId = goalId;
    }

    public Goal(int goalId, float goal) {
        this.goalId = goalId;
        this.goal = goal;
    }

    @JsonCreator
    public Goal(@JsonProperty("goalId") int goalId, @JsonProperty("goal") float goal,
                @JsonProperty("title") String title, @JsonProperty("description") String description) {
        this.goalId = goalId;
        this.goal = goal;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return goalId;
    }

    public float getGoal() {
        return goal;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


}
