package com.dota.hue.services;

import com.dota.hue.AppConfiguration;
import com.dota.hue.api.Map;

public class HueService {

    private AppConfiguration configuration;

    public HueService(AppConfiguration configuration) {
        this.configuration = configuration;
    }

    public void handleMapEvent(Map map) {
        if (configuration.getBountyRuneSpawning()) {
            if(map.getGameTime() == 150) {
                HttpClient.setLight();
            }
        }
    }

}
