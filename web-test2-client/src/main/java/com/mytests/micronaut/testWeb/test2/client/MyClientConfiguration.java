package com.mytests.micronaut.testWeb.test2.client;

import io.micronaut.http.client.DefaultHttpClientConfiguration;
import io.micronaut.http.client.HttpClientConfiguration;
import io.micronaut.runtime.ApplicationConfiguration;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * *******************************
 * <p>Created by irina on 14.05.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Singleton
@Named("micronaut-web-test2")
public class MyClientConfiguration extends HttpClientConfiguration {

    private final DefaultHttpClientConfiguration.DefaultConnectionPoolConfiguration connectionPoolConfiguration;

    public MyClientConfiguration(ApplicationConfiguration applicationConfiguration,
                                 DefaultHttpClientConfiguration.DefaultConnectionPoolConfiguration connectionPoolConfiguration) {
        super(applicationConfiguration);
        this.connectionPoolConfiguration = connectionPoolConfiguration;
    }

    @Override
    public ConnectionPoolConfiguration getConnectionPoolConfiguration() {
        return connectionPoolConfiguration;
    }
}
