package be.designisdead.poker.api;

import be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms.Room;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.ExchangeFunctions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.List;

public class Client {

    private ExchangeFunction exchange = ExchangeFunctions.create(new ReactorClientHttpConnector());


    public static void main(String[] args) throws Exception {
        Client client = new Client();
       client.getAllRooms();
    }

    public void getAllRooms() {
        URI uri = URI.create(String.format("http://%s:%d/rooms/list", Server.HOST, Server.PORT));
        ClientRequest request = ClientRequest.method(HttpMethod.GET, uri).build();

        Flux<Room> rooms = exchange.exchange(request)
                                   .flatMapMany(response -> response.bodyToFlux(Room.class));

        Mono<List<Room>> roomsList = rooms.collectList();
        System.out.println(roomsList.block());
    }


}