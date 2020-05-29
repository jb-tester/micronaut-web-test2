package com.mytests.micronaut.testWeb.test2.client;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

/**
 * *******************************
 * <p>Created by irina on 28.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Controller
public class UseMyClient {

    @Inject
    MyClient client;
    
    
    @Get("/client/_test0")
    public String test0Client(){
        return client.test0().blockingGet();
    }
     @Get("/client/_test1")
    public String test1Client(){
        return client.test1("foo").blockingGet();
     }

    @Get("/client/_test2")
    public String test2Client(){
        return client.test2("foo","bar").blockingGet();
    }
}
