package be.designisdead.poker.api.be.designisdead.poker.api.handler;

import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by j.peeters on 05/12/2017.
 */
public class VersionHandler {

    public static final String VERSION = "Poker-api-v1.0";

    public RouterFunction<ServerResponse> getVersion() {
        return route(GET("/version"), request -> ok().body(fromObject(VERSION)));
    }
}
