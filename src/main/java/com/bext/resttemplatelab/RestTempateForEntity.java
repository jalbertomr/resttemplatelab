package com.bext.resttemplatelab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.Callable;

@SpringBootApplication
public class RestTempateForEntity {
    public static void main(String... args){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
        String body = responseEntity.getBody();
        HttpHeaders headers = responseEntity.getHeaders();
        System.out.println(body);
        System.out.println(headers);
        //output in : responseGetForEntity.txt
    }


}
