package com.bext.resttemplatelab;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class RestTemplateObjectMapper {
    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String forObjectString = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);
        System.out.println(forObjectString);
/*
[
  {
    "userId": 1,
    "id": 1,
    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
  },
  {
    "userId": 1,
    "id": 2,
    "title": "qui est esse",
    "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
  },
....
 {
    "userId": 10,
    "id": 99,
    "title": "temporibus sit alias delectus eligendi possimus magni",
    "body": "quo deleniti praesentium dicta non quod\naut est molestias\nmolestias et officia quis nihil\nitaque dolorem quia"
  },
  {
    "userId": 10,
    "id": 100,
    "title": "at nam consequatur ea labore ea harum",
    "body": "cupiditate quo est a modi nesciunt soluta\nipsa voluptas error itaque dicta in\nautem qui minus magnam et distinctio eum\naccusamus ratione error aut"
  }
]

 */
        List<Post> listPost = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Post> posts = objectMapper.readValue(forObjectString, new TypeReference<List<Post>>(){});
        posts.stream().skip(95).forEach(p -> System.out.println(p.getId() + " " + p.getTitle()));
/*
96 quaerat velit veniam amet cupiditate aut numquam ut sequi
97 quas fugiat ut perspiciatis vero provident
98 laboriosam dolor voluptates
99 temporibus sit alias delectus eligendi possimus magni
100 at nam consequatur ea labore ea harum
 */
    }
}
