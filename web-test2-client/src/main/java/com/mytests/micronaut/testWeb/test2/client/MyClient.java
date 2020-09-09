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
@Client(id = "micronaut-web-test2")
public interface MyClient {

    @Get("/test0")
    Single<String> test0();

    @Get("/test1/{myvar1}")
    Single<String> test1(@PathVariable("myvar1") String v1);

    @Get("/test2/{v1}/{v2}")
    Single<String> test2(String v1, String v2);

    @Get("/test3/foo{myvar3}bar")
    Single<String> test3(@PathVariable("myvar3") String v3);

    @Get("/test3/{myvar3}")
    Single<String> test31(@PathVariable("myvar3") String v3);

    @Get("/test4/{myvar4}/{myvar3}")
    Single<String> test4(@PathVariable("myvar3") String v3, @PathVariable("myvar4") String v4);

    @Get("/test5/{myvar3}")
    Single<String> test5(@PathVariable("myvar3") String v3);
}
