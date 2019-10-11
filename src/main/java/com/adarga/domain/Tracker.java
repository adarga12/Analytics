package com.adarga.domain;

import java.util.ArrayList;

/**
 * Composition of a Goal and associated Records.  Eventually this object may holds statistics, notes, and
 * additional information.  As it stands today, it's not adding much other than complexity for complexity's sake.
 * Created by Chris on 6/13/2017.
 */
public class Tracker {

    private Goal goal;  //The goal we're tracking
    private ArrayList<Record> records;  //The progress records toward the goal

    public Tracker(Goal goal) {
        this.goal = goal;
        records = new ArrayList<>();
    }

    public Tracker(Goal goal, ArrayList<Record> records) {
        this.goal = goal;
        this.records = records;
    }

    public Goal getGoal() {
        return goal;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public void updateRecord(Record record) {
        int index = -1;
        for (Record rec : records) {
            if (rec.getId() == record.getId()) {
                index = records.indexOf(rec);
                break;
            }
        }

        if (index >= 0)
            records.set(index, record);
    }

}
