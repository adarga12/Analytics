package com.adarga.data;

import com.adarga.domain.Goal;
import com.adarga.domain.Record;
import com.adarga.domain.Tracker;

import java.util.ArrayList;

/**
 * Data access interface.
 * Created by Chris on 6/14/2017.
 */
public interface DataStore {

    //TODO: Consider a better solution than this default no-op method body.
    static DataStore getInstance() {
        return null;
    }

    ArrayList<Record> getAllRecords();

    void addRecord(Record record);

    ArrayList<Tracker>  getTrackers();

    Tracker getTracker(int goalId);

    void addGoal(Goal goal);
}
