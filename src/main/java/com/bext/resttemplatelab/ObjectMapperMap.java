package com.bext.resttemplatelab;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class ObjectMapperMap {
    public static void main(String[] args) throws JsonProcessingException {
       String jsonString = "{\"dia\" : \"lunes\" , \"fecha\" : \"Fri Dec 02 13:00:00 CST 3870\"}";
       ObjectMapper objectMapper = new ObjectMapper();
       Map<String, Object> map = objectMapper.readValue( jsonString, new TypeReference<Map<String, Object>>() {});
       System.out.println(map);
       //{dia=lunes, fecha=Fri Dec 02 13:00:00 CST 3870}

    }
}
