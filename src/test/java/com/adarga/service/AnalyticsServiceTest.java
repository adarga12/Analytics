package com.adarga.service;

import com.adarga.service.AnalyticsService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AnalyticsServiceTest {
    private AnalyticsService service = new AnalyticsService();

    public AnalyticsServiceTest() {

    }

    //TODO: come up with some "real" unit tests for this.
    @Test
    public void testAnalyticsService() {
        assertTrue(service != null);
        assertNotNull(service);
    }
}
