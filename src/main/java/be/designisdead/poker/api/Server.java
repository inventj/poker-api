package be.designisdead.poker.api;

import be.designisdead.poker.api.be.designisdead.poker.api.handler.VersionHandler;
import be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms.RoomHandler;
import be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms.RoomRepository;
import be.designisdead.poker.api.be.designisdead.poker.api.handler.rooms.StaticRoomRepository;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.ipc.netty.http.server.HttpServer;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;


/**
 * Reactor Server based on netty
 * @author Joeri Peeters
 */
public class Server {

	public static final String HOST = "localhost";

	public static final int PORT = 8080;

	public static void main(String[] args) throws Exception {
		Server server = new Server();
		server.startReactorServer();
		System.in.read();
	}

	public void startReactorServer() throws InterruptedException {
		//HttpHandler httpHandler = toHttpHandler(new VersionHandler().getVersion());

		HttpHandler httpHandler = toHttpHandler(routingFunction());
		ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
		HttpServer server = HttpServer.create(HOST, PORT);
		server.newHandler(adapter).block();
	}


	public RouterFunction<ServerResponse> routingFunction() {
		RoomRepository repository = new StaticRoomRepository();
		RoomHandler handler = new RoomHandler(repository);

		return route(GET("/rooms/list"), handler::listRooms);
	}

}
