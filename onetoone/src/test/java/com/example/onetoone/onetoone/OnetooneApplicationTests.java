package com.example.onetoone.onetoone;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnetooneApplicationTests {
	String a="java";

	@Test
	void contextLoads() {
	}
	@Test
	void tests() {
		assertEquals(a, "java1");
		
	}
	public static void main(String arg[]) {
		OnetooneApplicationTests ob=new OnetooneApplicationTests();
		ob.tests();
		
	}

}
