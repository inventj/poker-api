package be.designisdead.poker.api.rooms;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by j.peeters on 05/12/2017.
 */
public class StaticRoomRepository implements RoomRepository {

    private final Map<Integer, Room> rooms = new HashMap<>();

    public StaticRoomRepository() {

        this.rooms.put(1, new Room(1L,"LrEvxCuJqp"));
        this.rooms.put(2, new Room(2L,"GzKdPGzXDg"));
        this.rooms.put(3, new Room(3L,"YiKgjPyOkX"));
        this.rooms.put(4, new Room(4L,"sZlYaRJwRU"));
        this.rooms.put(5, new Room(5L,"PfKIlmUOUi"));
        this.rooms.put(6, new Room(6L,"osRARpCAAK"));
        this.rooms.put(7, new Room(7L,"RzEGvWjrul"));
        this.rooms.put(8, new Room(8L,"MArLPCZztt"));
        this.rooms.put(9, new Room(9L,"BUMdEMgCTZ"));
        this.rooms.put(10, new Room(10L,"WrTyZpbYYh"));
        this.rooms.put(11, new Room(11L,"tEUwASOlYY"));
        this.rooms.put(12, new Room(12L,"qLaUMLbeNA"));
        this.rooms.put(13, new Room(13L,"oFlCayDMla"));
        this.rooms.put(14, new Room(14L,"cbDqBDUtjw"));
        this.rooms.put(15, new Room(15L,"BEoPpJCjAe"));
        this.rooms.put(16, new Room(16L,"TgAotTHkRB"));
        this.rooms.put(17, new Room(17L,"QZxpscxKwR"));
        this.rooms.put(18, new Room(18L,"mdxpnNYBJT"));
        this.rooms.put(19, new Room(19L,"JyrHgbSefY"));
        this.rooms.put(20, new Room(20L,"NZWFkcdXvM"));
        this.rooms.put(21, new Room(21L,"VAcFuRXniK"));
        this.rooms.put(22, new Room(22L,"gkCtCrFdMH"));
        this.rooms.put(23, new Room(23L,"cuzlJExYGb"));
        this.rooms.put(24, new Room(24L,"OygbqDFofz"));
        this.rooms.put(25, new Room(25L,"ReLzKPgJsY"));
        this.rooms.put(26, new Room(26L,"xFieixCDmX"));
        this.rooms.put(27, new Room(27L,"JEoUeHAhBT"));
        this.rooms.put(28, new Room(28L,"dYpkfSANLu"));
        this.rooms.put(29, new Room(29L,"EiRbZGvbhT"));
        this.rooms.put(30, new Room(30L,"exNQkTGKNh"));
        this.rooms.put(31, new Room(31L,"LlalrOPSHY"));
        this.rooms.put(32, new Room(32L,"MDXpQRyAbY"));
        this.rooms.put(33, new Room(33L,"mzWUKsHZCD"));
        this.rooms.put(34, new Room(34L,"auozlmYHnZ"));
        this.rooms.put(35, new Room(35L,"ztiqZwbZsf"));
        this.rooms.put(36, new Room(36L,"lajhokBtlX"));
        this.rooms.put(37, new Room(37L,"qbqBWZjqNQ"));
        this.rooms.put(38, new Room(38L,"HvUWNrkeqX"));
        this.rooms.put(39, new Room(39L,"gCSDrwYAmx"));
        this.rooms.put(40, new Room(40L,"gINZvINtok"));

    }

    /*@Override
    public Flux<Room> getRooms() {
        return Flux.fromIterable(this.rooms.values());
    }*/
/*
    @Override
    public Mono<Room> addRoom(Room room) {
        return Mono.empty();
    }*/
}
