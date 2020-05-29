package com.mytests.micronaut.testWeb.test2.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * *******************************
 * <p>Created by irina on 28.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Controller()
public class SimpleController1 {
    
    @Get("/test0")
    public String test0(){
        return "simple  test0";
    }
    @Get("/test1/{myvar1}")
    public String test1(@PathVariable("myvar1") String v1){
        return "simple test1 "+v1;
    }
    @Get("/test2/{myvar1}/{myvar2}")
    public String test2(@PathVariable("myvar1") String v1, @PathVariable("myvar2") String v2){
        return "simple test2 "+v1+v2;
    }
}
