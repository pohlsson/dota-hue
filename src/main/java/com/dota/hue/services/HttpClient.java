package com.dota.hue.services;


import javax.ws.rs.client.Client;
import org.glassfish.jersey.client.JerseyClientBuilder;

public class HttpClient {
    public static void setLight() {
        Client client = new JerseyClientBuilder().build();
        System.out.println("SETTING LIGHT");
    }
}
