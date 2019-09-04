package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Goal;
import com.adarga.domain.Record;
import com.adarga.domain.Tracker;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Implementation of the service layer of the Analytics application
 * Created by cbolton on 6/11/17.
 */
@Service
public class AnalyticsService {

    @Autowired
    private DataStore dataStore;

    public static final int DAY = 0;
    public static final int WEEK = 1;
    public static final int MONTH = 2;
    public static final int YEAR = 3;
    public static final int ALL_TIME = 4;

    public AnalyticsService() {}

    public ArrayList<Record> getAllRecords() {
        return dataStore.getAllRecords();
    }

    public void addRecord(Record m) {
        dataStore.getTracker(m.getGoalId()).addRecord(m);
    }

    public void addGoal(Goal g) {
        dataStore.addGoal(g);
    }

    public ArrayList<Tracker> getTrackers() {
        return dataStore.getTrackers();
    }

    //TODO: Implement averaging features
    public float getAverageSuccessRate(Goal goal, int timespan) {
        DateTime now = DateTime.now();
        // TODO: Retrieve tracker
        ArrayList<Record> records = new ArrayList<>();
        float average = 0;
        switch (timespan) {
            case DAY:
                average = getAverage(records, DateTime.now().minus(Duration.standardDays(1)));
                break;
            case WEEK:
                average = getAverage(records, DateTime.now().minus(Duration.standardDays(7)));
                break;
            case MONTH:
//                average = getAverage(records, DateTime.now().minus(Duration.standardDays(1)));
                break;
            case YEAR:
//                average = getAverage(records, DateTime.now().minus(Duration.standardDays(1)));
                break;
            case ALL_TIME:
                average = getAverage(records, null);
                break;
            default:
        }
        return 0.0f;
    }

    private float getAverage(ArrayList<Record> records, DateTime timespan) {
        if (timespan == null) {
//            return records.stream().filter(record -> record.getTimestamp().isAfter(timespan));
        }
        records.stream().filter(record -> record.getTimestamp().isAfter(timespan));
        return 0.0f;
    }

}
