package be.designisdead.poker.api.rooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Created by j.peeters on 05/12/2017.
 */
@Component
public class RoomHandler {

    @Autowired
    private ReactiveMongoRoomRepository repository;

    public Mono<ServerResponse> listRooms(ServerRequest request) {
        Flux<Room> rooms = repository.findAll();
        return ServerResponse.ok().contentType(APPLICATION_JSON).body(rooms, Room.class);
    }

    public void addRoom(Room room) {
        repository.save(room).subscribe();
    }
}
