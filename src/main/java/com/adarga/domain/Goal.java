package com.adarga.domain;

/**
 * A (daily) goal the user is trying to achieve.  Examples include miles to run, minutes to spend studying, or calories
 * to stay under.
 * Created by cbolton on 6/9/17.
 */
public class Goal {
    public void setGoal(int goal) {
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

    public Goal() {}

    public Goal(float goal) {
        this.goal = goal;
    }

    public Goal(float goal, String title, String description) {
        this.goal = goal;
        this.title = title;
        this.description = description;
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
