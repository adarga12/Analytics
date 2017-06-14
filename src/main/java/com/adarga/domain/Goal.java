package com.adarga.domain;

/**
 * A goal the user is trying to achieve.  Examples include miles to run, minutes to spend studying, or calories
 * to stay under.
 * Created by cbolton on 6/9/17.
 */
public class Goal {

    private int goalId;

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

    public Goal(int goalId, float goal, String title, String description) {
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
