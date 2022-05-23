package com.bext.resttemplatelab;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class LiveTemplates {

    public static void main(String[] args) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "https://jsonplaceholder.typicode.com/posts/1";
        URI uri = new URI(baseUrl);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        HttpHeaders headers = responseEntity.getHeaders();
        int statusCodeValue = responseEntity.getStatusCodeValue();
        String responseString = responseEntity.getBody();

    }


}