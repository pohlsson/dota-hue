package com.dota.hue;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import javax.validation.constraints.NotNull;

public class AppConfiguration extends Configuration {

    @NotNull
    private Boolean bountyRuneSpawning;

    @JsonProperty
    public Boolean getBountyRuneSpawning() {
        return bountyRuneSpawning;
    }

    @JsonProperty
    public void setBountyRuneSpawning(Boolean bountyRuneSpawning) {
        this.bountyRuneSpawning = bountyRuneSpawning;
    }
}

