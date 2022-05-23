package com.bext.resttemplatelab;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

public class RestTemplateJson {
    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);
        System.out.println( forObject);
/*
{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
*/
        ResponseEntity<String> forEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", String.class);
        System.out.println( forEntity.getBody());
/*
{
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
 */
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(Objects.requireNonNull(forEntity.getBody()));
        JsonNode userId = root.path("userId");
        System.out.println(root);
        /*
         {"userId":1,"id":1,"title":"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","body":"quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"}
        */
        System.out.println(userId);
        // 1
    }
}
