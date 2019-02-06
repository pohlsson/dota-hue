package com.dota.hue;

import com.dota.hue.resources.DotaResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "dota hue application";
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        final DotaResource dotaResource = new DotaResource(configuration);
        environment.jersey().register(dotaResource);
    }
}