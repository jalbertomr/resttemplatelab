package com.bext.resttemplatelab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateForObjectPost {
    public static void main(String... args){
        RestTemplate restTemplate = new RestTemplate();
        Post post = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", Post.class);
        System.out.println("Post Object: " + post);
        System.out.println("Title: " + post.getTitle());
        System.out.println("Body: " + post.getBody());
        /*output
        com.bext.resttemplatelab.Post@2d2ffcb7
Title: sunt aut facere repellat provident occaecati excepturi optio reprehenderit
Body: quia et suscipit
suscipit recusandae consequuntur expedita et cum
reprehenderit molestiae ut ut quas totam
nostrum rerum est autem sunt rem eveniet architecto
         */

    }
}
