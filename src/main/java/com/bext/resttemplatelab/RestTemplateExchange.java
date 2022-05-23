package com.bext.resttemplatelab;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class RestTemplateExchange {
    public static void main(String[] args) throws URISyntaxException {
        
        RequestEntity requestEntity = new RequestEntity(HttpMethod.GET, new URI("https://jsonplaceholder.typicode.com/posts/1"));

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Post> postEntity = restTemplate.exchange(requestEntity, Post.class);
        Post post = postEntity.getBody();
        System.out.println( post.getBody());

        /* quia et suscipit
suscipit recusandae consequuntur expedita et cum
reprehenderit molestiae ut ut quas totam
nostrum rerum est autem sunt rem eveniet architecto

         */
    }
}
