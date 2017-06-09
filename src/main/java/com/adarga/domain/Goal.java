package com.adarga.domain;

/**
 * A (daily) goal the user is trying to achieve.  Examples include miles to run, minutes to spend studying, or calories
 * to stay under.
 * Created by cbolton on 6/9/17.
 */
public class Goal {
    private int goal;
    private String title;
    private String description;

    public Goal(int goal) {
        this.goal = goal;
    }

    public Goal(int goal, String title, String description) {
        this.goal = goal;
        this.title = title;
        this.description = description;
    }
}
