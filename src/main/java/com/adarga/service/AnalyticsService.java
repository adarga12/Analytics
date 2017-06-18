package com.adarga.service;

import com.adarga.data.DataStore;
import com.adarga.domain.Goal;
import com.adarga.domain.Metric;
import com.adarga.domain.Tracker;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    private static final int DAY = 0;
    private static final int WEEK = 1;
    private static final int MONTH = 2;
    private static final int YEAR = 3;
    private static final int ALL_TIME = 4;

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

    public float getAverageSuccessRate(int goalId, int timespan) {
        Tracker tracker = dataStore.getTracker(goalId);
        ArrayList<Metric> metrics = tracker.getMetrics();
        switch (timespan) {
            case DAY:
                return getAverage(metrics, DateTime.now().minus(Duration.standardDays(1)));
            case WEEK:
                return getAverage(metrics, DateTime.now().minus(Duration.standardDays(7)));
            case MONTH:
                return getAverage(metrics, DateTime.now().minus(Duration.standardDays(30)));
            case YEAR:
                return getAverage(metrics, DateTime.now().minus(Duration.standardDays(365)));
            case ALL_TIME:
                return getAverage(metrics, null);
        }
        return 0.0f;
    }

    private float getAverage(ArrayList<Metric> metrics, DateTime timespan) {
        if (timespan == null) {
            return (float)metrics.stream().collect(Collectors.summarizingDouble(Metric::getProgress)).getAverage();
        }
        DoubleSummaryStatistics qualified = metrics.stream()
                .filter(metric -> metric.getTimestamp().isAfter(timespan))
                .collect(Collectors.summarizingDouble(Metric::getProgress));
        return (float)qualified.getAverage();
    }

    public void deleteGoal(Goal goal) {
        dataStore.getTrackers().remove(dataStore.getTracker(goal.getId()));
    }

    public void deleteMetric(Metric metric) {
        dataStore.getTracker(metric.getGoalId()).getMetrics().remove(metric);
    }
}
