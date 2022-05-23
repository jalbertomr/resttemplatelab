package com.bext.resttemplatelab;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class RestTemplatePostFor {
    public static void main(String... args) throws MalformedURLException {
        // PostForObject

        Date aDate = new Date(1970,11,2,13,00,00);
        ObjectRich objectRich = new ObjectRich(1,1000000L, 100, 1245678.34567,new BigDecimal(123.4567),"Texto", aDate);

        RestTemplate restTemplate = new RestTemplate();
        URL resourceUrl = new URL("file:src/main/resources/objectrich.json");

        HttpEntity<Foo> request = new HttpEntity<>( new Foo("bar"));
        restTemplate.postForObject( "", request, ObjectRich.class);
    }

    static  class Foo{
        private String bar;

         public Foo(String bar) {
             this.bar = bar;
         }

         public String getBar() {
             return bar;
         }

         public void setBar(String bar) {
             this.bar = bar;
         }

         @Override
         public String toString() {
             return "Foo{" +
                     "bar='" + bar + '\'' +
                     '}';
         }
     }
}
