package be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms;

import reactor.core.publisher.Flux;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by j.peeters on 05/12/2017.
 */
public class StaticRoomRepository implements RoomRepository {

    private final Map<Integer, Room> rooms = new HashMap<>();

    public StaticRoomRepository() {
        this.rooms.put(1, new Room(1L,"LrEvxCuJqp",  LocalDateTime.now().toString()));
        this.rooms.put(2, new Room(2L,"GzKdPGzXDg",  LocalDateTime.now().toString()));
        this.rooms.put(3, new Room(3L,"YiKgjPyOkX",  LocalDateTime.now().toString()));
        this.rooms.put(4, new Room(4L,"sZlYaRJwRU",  LocalDateTime.now().toString()));
        this.rooms.put(5, new Room(5L,"PfKIlmUOUi",  LocalDateTime.now().toString()));
        this.rooms.put(6, new Room(6L,"osRARpCAAK",  LocalDateTime.now().toString()));
        this.rooms.put(7, new Room(7L,"RzEGvWjrul",  LocalDateTime.now().toString()));
        this.rooms.put(8, new Room(8L,"MArLPCZztt",  LocalDateTime.now().toString()));
        this.rooms.put(9, new Room(9L,"BUMdEMgCTZ",  LocalDateTime.now().toString()));
        this.rooms.put(10, new Room(10L,"WrTyZpbYYh", LocalDateTime.now().toString()));
        this.rooms.put(11, new Room(11L,"tEUwASOlYY", LocalDateTime.now().toString()));
        this.rooms.put(12, new Room(12L,"qLaUMLbeNA", LocalDateTime.now().toString()));
        this.rooms.put(13, new Room(13L,"oFlCayDMla", LocalDateTime.now().toString()));
        this.rooms.put(14, new Room(14L,"cbDqBDUtjw", LocalDateTime.now().toString()));
        this.rooms.put(15, new Room(15L,"BEoPpJCjAe", LocalDateTime.now().toString()));
        this.rooms.put(16, new Room(16L,"TgAotTHkRB", LocalDateTime.now().toString()));
        this.rooms.put(17, new Room(17L,"QZxpscxKwR", LocalDateTime.now().toString()));
        this.rooms.put(18, new Room(18L,"mdxpnNYBJT", LocalDateTime.now().toString()));
        this.rooms.put(19, new Room(19L,"JyrHgbSefY", LocalDateTime.now().toString()));
        this.rooms.put(20, new Room(20L,"NZWFkcdXvM", LocalDateTime.now().toString()));
        this.rooms.put(21, new Room(21L,"VAcFuRXniK", LocalDateTime.now().toString()));
        this.rooms.put(22, new Room(22L,"gkCtCrFdMH", LocalDateTime.now().toString()));
        this.rooms.put(23, new Room(23L,"cuzlJExYGb", LocalDateTime.now().toString()));
        this.rooms.put(24, new Room(24L,"OygbqDFofz", LocalDateTime.now().toString()));
        this.rooms.put(25, new Room(25L,"ReLzKPgJsY", LocalDateTime.now().toString()));
        this.rooms.put(26, new Room(26L,"xFieixCDmX", LocalDateTime.now().toString()));
        this.rooms.put(27, new Room(27L,"JEoUeHAhBT", LocalDateTime.now().toString()));
        this.rooms.put(28, new Room(28L,"dYpkfSANLu", LocalDateTime.now().toString()));
        this.rooms.put(29, new Room(29L,"EiRbZGvbhT", LocalDateTime.now().toString()));
        this.rooms.put(30, new Room(30L,"exNQkTGKNh", LocalDateTime.now().toString()));
        this.rooms.put(31, new Room(31L,"LlalrOPSHY", LocalDateTime.now().toString()));
        this.rooms.put(32, new Room(32L,"MDXpQRyAbY", LocalDateTime.now().toString()));
        this.rooms.put(33, new Room(33L,"mzWUKsHZCD", LocalDateTime.now().toString()));
        this.rooms.put(34, new Room(34L,"auozlmYHnZ", LocalDateTime.now().toString()));
        this.rooms.put(35, new Room(35L,"ztiqZwbZsf", LocalDateTime.now().toString()));
        this.rooms.put(36, new Room(36L,"lajhokBtlX", LocalDateTime.now().toString()));
        this.rooms.put(37, new Room(37L,"qbqBWZjqNQ", LocalDateTime.now().toString()));
        this.rooms.put(38, new Room(38L,"HvUWNrkeqX", LocalDateTime.now().toString()));
        this.rooms.put(39, new Room(39L,"gCSDrwYAmx", LocalDateTime.now().toString()));
        this.rooms.put(40, new Room(40L,"gINZvINtok", LocalDateTime.now().toString()));
    }

    @Override
    public Flux<Room> getRooms() {
        return Flux.fromIterable(this.rooms.values());
    }
}
