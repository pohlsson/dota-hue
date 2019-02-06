package com.dota.hue.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Map {
    private Integer gameTime;

    public Map() {
        // Jackson deserialization
    }

    public Map(Integer gameTime) {
        this.gameTime = gameTime;
    }

    @JsonProperty
    public Integer getGameTime() {
        return gameTime;
    }

    @JsonProperty
    public void setGameTime(Integer gameTime) {
        this.gameTime = gameTime;
    }
}