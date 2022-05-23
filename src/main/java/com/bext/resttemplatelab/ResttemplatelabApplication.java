package com.bext.resttemplatelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class ResttemplatelabApplication {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);
        //System.out.println(response);
        //output in: responseAsString.txt


        List responseList = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", List.class);
        //System.out.println(responseList);
        //output in : responseAsList.txt

        responseList.forEach( post -> {
            System.out.println( post);
        });
        //output in: responseAsListForEach.txt


    }


}
