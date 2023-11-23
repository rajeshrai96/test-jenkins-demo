package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestJenkinsDemoApplicationTests {
private Logger logger= LoggerFactory.getLogger(TestJenkinsDemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("This is Jenkins test logger statement..................");
		Assertions.assertEquals(true,true);
	}

}
