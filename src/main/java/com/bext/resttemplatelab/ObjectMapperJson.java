package com.bext.resttemplatelab;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class ObjectMapperJson {
    public static void main(String... args) throws IOException {
        // Object To Jason
        Date aDate = new Date(1970,11,2,13,00,00);
        ObjectRich objectRich = new ObjectRich(1,1000000L, 100, 1245678.34567,new BigDecimal(123.4567),"Texto", aDate);

        // mapping to a file json
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/objectrich.json"), objectRich);
        /* file
{"anInt":1,"aLong":1000000,"integer":100,"aDouble":1245678.34567,"bigDecimal":123.4566999999999978854248183779418468475341796875,"text":"Texto","aDate":59987242800000}
         */

        // mapping to a string json
        String objectRichMappedToString = objectMapper.writeValueAsString(objectRich);
        System.out.println(objectRichMappedToString);
/*
        {"anInt":1,"aLong":1000000,"integer":100,"aDouble":1245678.34567,"bigDecimal":123.4566999999999978854248183779418468475341796875,"text":"Texto","aDate":59987242800000}
*/
        // to byte[]
        byte[] bytesobjectRich = objectMapper.writeValueAsBytes(objectRich);

        // Json to Object

        ObjectRich objectRich3= objectMapper.readValue(bytesobjectRich, ObjectRich.class);
        System.out.println(objectRich3);
/*
ObjectRich{anInt=1, aLong=1000000, integer=100, aDouble=1245678.34567, bigDecimal=123.4566999999999978854248183779418468475341796875, text='Texto', aDate=Fri Dec 02 13:00:00 CST 3870}
 */

        String jsonPost = "{\"userId\" : \"11\" , \"id\" : \"1000\" , \"title\" : \"titulo del post\" , \"body\" : \"contenido del post\"}";

        Post post = objectMapper.readValue(jsonPost, Post.class);
        System.out.println(post);
        // Post{userId=11, id=1000, title='titulo del post', body='contenido del post'}

        ObjectRich objectRich2 = new ObjectRich();
        objectRich2 = objectMapper.readValue(new URL("file:target/objectRich.json"), ObjectRich.class);
        System.out.println(objectRich2);
/*
ObjectRich{anInt=1, aLong=1000000, integer=100, aDouble=1245678.34567, bigDecimal=123.4566999999999978854248183779418468475341796875, text='Texto', aDate=Fri Dec 02 13:00:00 CST 3870}
 */
        List<ObjectRich> objectRich4 = null;
        objectRich4 = objectMapper.readValue(new URL("file:src/main/resources/objectriches.json"), new TypeReference<List<ObjectRich>> (){ } );
        System.out.println(objectRich4);
/*
[ObjectRich{anInt=1, aLong=1000000, integer=100, aDouble=1245678.34567, bigDecimal=123.4566999999999978854248183779418468475341796875, text='Texto', aDate=Fri Dec 02 13:00:00 CST 3870},
 ObjectRich{anInt=2, aLong=222222, integer=222, aDouble=1245678.22222, bigDecimal=222.4566999999999978854248183779418468475341796875, text='Texto', aDate=Fri Dec 02 13:20:00 CST 3870},
 ObjectRich{anInt=3, aLong=333333, integer=333, aDouble=1245678.33333, bigDecimal=333.4566999999999978854248183779418468475341796875, text='Texto', aDate=Fri Dec 02 13:53:20 CST 3870}
 ]
 */

    }
}
