package com.dota.hue.resources;

import com.dota.hue.AppConfiguration;
import com.dota.hue.services.HueService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class DotaResource {

    private HueService hueService;

    public DotaResource(AppConfiguration configuration) {
        hueService = new HueService(configuration);
    }

    @POST
    public void postDotaEvent(EventWrapper event) {
        System.out.println(event.getMap().getGameTime());
        hueService.handleMapEvent(event.getMap());
    }
}