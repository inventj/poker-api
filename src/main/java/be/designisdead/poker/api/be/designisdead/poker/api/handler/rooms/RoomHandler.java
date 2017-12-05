package be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Created by j.peeters on 05/12/2017.
 */
public class RoomHandler {

    private RoomRepository repository;

    public RoomHandler(RoomRepository roomRepository){
        this.repository = roomRepository;
    }

    public Mono<ServerResponse> listRooms(ServerRequest request) {
        Flux<Room> rooms = this.repository.getRooms();
        return ServerResponse.ok().contentType(APPLICATION_JSON).body(rooms, Room.class);
    }
}
