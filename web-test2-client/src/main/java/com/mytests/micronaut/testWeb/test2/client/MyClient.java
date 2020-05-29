package com.mytests.micronaut.testWeb.test2.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * *******************************
 * <p>Created by irina on 14.05.2020.</p>
 * <p>Project: micronaut-web-test2</p>
 * *******************************
 */
@Client(id="micronaut-web-test2")
public interface MyClient {
    
    @Get("/test0")
    Single<String> test0();
    
    @Get("/test1/{v1}")
    Single<String> test1(@PathVariable("v1") String v1);
    
    @Get("/test2/{v1}/{v2}")
    Single<String> test2(String v1, String v2);
}
