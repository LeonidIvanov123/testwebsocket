package ru.leonid.testwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
@EnableScheduling
public class TestwebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestwebsocketApplication.class, args);
	}

}


