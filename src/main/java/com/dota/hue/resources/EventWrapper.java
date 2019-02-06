package com.dota.hue.resources;

import com.dota.hue.api.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventWrapper {

    @JsonProperty("map")
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public EventWrapper() {

    }

    public EventWrapper(Map map) {
        this.map = map;
    }
}