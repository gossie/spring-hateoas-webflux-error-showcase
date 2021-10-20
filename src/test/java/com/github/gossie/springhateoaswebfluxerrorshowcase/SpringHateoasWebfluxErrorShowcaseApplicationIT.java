package com.github.gossie.springhateoaswebfluxerrorshowcase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@SpringBootTest
@AutoConfigureWebTestClient
class SpringHateoasWebfluxErrorShowcaseApplicationIT {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void contextLoads() {
		webTestClient
				.post()
				.uri("/echo")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(new Message("Hello World")))
				.exchange()
				.expectStatus().isOk()
				.expectBody(Message.class).isEqualTo(new Message("Hello World"));
	}

}
