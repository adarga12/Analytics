package com.adarga.domain;

/**
 * Created by cbolton on 6/9/17.
 */
public class Metric {

    private Goal goal;

    public Metric (Goal goal, int progress) {
        this.goal = goal;
        this.progress = progress;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    private int progress;

    public int getProgress() {
        return progress;
    }

    public Goal getGoal() {
        return goal;
    }


}
