package com.bext.resttemplatelab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class RestTemplateForEntityPost {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Post> forEntityPost = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", Post.class);

        HttpHeaders headers = forEntityPost.getHeaders();
        System.out.println(headers);
        System.out.println();

/*[Date:"Wed, 09 Feb 2022 16:35:18 GMT", Content-Type:"application/json; charset=utf-8", Content-Length:"292", Connection:"keep-alive",
X-Powered-By:"Express", X-Ratelimit-Limit:"1000", X-Ratelimit-Remaining:"999", X-Ratelimit-Reset:"1644400945", Vary:"Origin, Accept-Encoding",
Access-Control-Allow-Credentials:"true", Cache-Control:"max-age=43200", Pragma:"no-cache", Expires:"-1", X-Content-Type-Options:"nosniff",
Etag:"W/"124-yiKdLzqO5gfBrJFrcdJ8Yq0LGnU"", Via:"1.1 vegur", CF-Cache-Status:"HIT", Age:"23623", Accept-Ranges:"bytes", Expect-CT:"max-age=604800,
 report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"",
  Report-To:"{"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=IrLgReohySk8uIUmp8sxQNhcv0RaqyheOlIr4mqFW4Pa9y2WJLbB4L8fCRk4EBvuVqanC7bkK8x0Yr2dpa2c2k9dWx7tQ%2B%2F1VXaKl4AzEPr6wxYHqgfWNmLgIxQyr7rlJYEVXjO0sjy%2Bz7GmCuKB"}],
  "group":"cf-nel","max_age":604800}", NEL:"{"success_fraction":0,"report_to":"cf-nel","max_age":604800}", Server:"cloudflare",
  CF-RAY:"6dae82966bf1101c-ATL", alt-svc:"h3=":443"; ma=86400, h3-29=":443"; ma=86400"]
 */
        System.out.println( headers.get("Date"));                 // [Wed, 09 Feb 2022 16:54:15 GMT]
        long datelong = headers.getDate();                        // 1644425989000
        Date date = new Date( datelong);
        System.out.println( date);                                // Wed Feb 09 10:57:46 CST 2022

        List<String> ct = headers.get("Content-Type");
        System.out.println(ct);                                    // [application/json; charset=utf-8]

        System.out.println( headers.getAccept() );                 // []
        System.out.println( headers.getAcceptCharset());           // []
        System.out.println( headers.getAcceptPatch());             // []
        System.out.println( headers.getAcceptLanguage());          // []
        System.out.println( headers.getAccessControlAllowCredentials());  // true
        System.out.println(headers.getAccessControlAllowMethods());  // []
        System.out.println( headers.getAccessControlMaxAge());       // -1
        System.out.println( headers.getHost());                      // null
        System.out.println( headers.getCacheControl());              // max-age=43200
        System.out.println( headers.getConnection());                // [keep-alive]

        Post body = forEntityPost.getBody();
        System.out.println(body.getBody());
                                                                     /* quia et suscipit
                                                                     suscipit recusandae consequuntur expedita et cum
                                                                     reprehenderit molestiae ut ut quas totam
                                                                     nostrum rerum est autem sunt rem eveniet architecto
                                                                     */
        HttpStatus statusCode = forEntityPost.getStatusCode();
        System.out.println(statusCode);                              // 200 OK
        System.out.println(statusCode.getReasonPhrase());            // OK
    }
}
