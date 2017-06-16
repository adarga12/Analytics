package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Goal;
import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

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

    public ArrayList<Metric> getAllMetrics() {
        return dataStore.getAllMetrics();
    }

    public void addMetric(Metric m) {
        dataStore.getTracker(m.getGoalId()).addMetric(m);
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
        ArrayList<Metric> metrics = new ArrayList<Metric>();
        float average = 0;
        switch (timespan) {
            case DAY:
                average = getAverage(metrics, DateTime.now().minus(Duration.standardDays(1)));
                break;
            case WEEK:
                average = getAverage(metrics, DateTime.now().minus(Duration.standardDays(7)));
                break;
            case MONTH:
//                average = getAverage(metrics, DateTime.now().minus(Duration.standardDays(1)));
                break;
            case YEAR:
//                average = getAverage(metrics, DateTime.now().minus(Duration.standardDays(1)));
                break;
            case ALL_TIME:
                average = getAverage(metrics, null);
                break;
            default:
        }
        return 0.0f;
    }

    private float getAverage(ArrayList<Metric> metrics, DateTime timespan) {
        if (timespan == null) {
//            return metrics.stream().filter(metric -> metric.getTimestamp().isAfter(timespan));
        }
        DoubleSummaryStatistics qualified = metrics.stream()
                .filter(metric -> metric.getTimestamp().isAfter(timespan))
                .collect(Collectors.summarizingDouble(Metric::getProgress));
        return (float)qualified.getAverage();
    }

}
