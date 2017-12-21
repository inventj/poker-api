package be.designisdead.poker.api.rooms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by j.peeters on 05/12/2017.
 */
@Configuration
public class RoomsRoute {
    @Bean
    public static RouterFunction<ServerResponse> listAll(RoomHandler handler) {
        return route(GET("/rooms/list"), handler::listRooms);
    }

    @Bean
    public static RouterFunction<ServerResponse> addRoom(RoomHandler handler) {
       return route(POST("/rooms/add"), request ->
                request.bodyToMono(Room.class).doOnNext(handler::addRoom).then(ok().build()));
    }
}
