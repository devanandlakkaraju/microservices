package com.eazybytes.loans;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "build.version=test")
class LoansApplicationTests {

	@Test
	void contextLoads() {
	}

}
