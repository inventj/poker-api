package be.designisdead.poker.api;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
/**
 * Reactor PokerApiApp based on netty
 * @author Joeri Peeters
 */
@SpringBootApplication
@ComponentScan
@EnableReactiveMongoRepositories
public class PokerApiApp extends AbstractReactiveMongoConfiguration{

	public static void main(String [] args){
		SpringApplication.run(PokerApiApp.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return "api-reactive-mongo-db";
	}

	@Override
	@Bean
	@DependsOn("embeddedMongoServer")
	public MongoClient reactiveMongoClient() {
		return MongoClients.create(String.format("mongodb://localhost"));
	}
}
