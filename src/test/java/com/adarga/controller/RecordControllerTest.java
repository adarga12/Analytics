package com.adarga.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class RecordControllerTest {

    @Test
    public void testGetRecords() throws URISyntaxException {
        RestTemplate template = new RestTemplate();

        URI uri = new URI("http://localhost:8080/Records");
        ResponseEntity<String> result = template.getForEntity(uri, String.class);

        Assert.assertEquals(200, result.getStatusCodeValue());
        System.out.println(result.getBody());
        Assert.assertEquals(true, result.getBody().contains("Minutes spent on cardiovascular exercise"));
    }
}
