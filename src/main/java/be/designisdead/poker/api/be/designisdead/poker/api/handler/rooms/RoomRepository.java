package be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms;

import reactor.core.publisher.Flux;

/**
 * Created by j.peeters on 05/12/2017.
 */
public interface RoomRepository {

    Flux<Room> getRooms();
}
