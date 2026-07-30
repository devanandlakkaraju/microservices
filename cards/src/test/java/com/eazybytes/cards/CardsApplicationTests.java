package com.eazybytes.cards;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "build.version=test")
class CardsApplicationTests {

	@Test
	void contextLoads() {
	}

}
