package com.bodex.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	
	@Test
	public void factTest() {
		
		HelloWorld hw = new HelloWorld();
		assertEquals(24,hw.factorial(4));
		assertEquals(5040,hw.factorial(7));
		
	}
}
