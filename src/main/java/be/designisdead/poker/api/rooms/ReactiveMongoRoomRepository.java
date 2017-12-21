package be.designisdead.poker.api.rooms;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * Created by j.peeters on 05/12/2017.
 */
@Repository
interface ReactiveMongoRoomRepository extends ReactiveCrudRepository<Room, String>, RoomRepository {

}
