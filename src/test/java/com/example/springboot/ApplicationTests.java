package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMain() {
		Application.main(new String[] {});
	}

	@Test
	void testHelloWorldStrinf () {
		String result = "Hello World!";
		assert(result.equals("Hello World!"));
	}

}
