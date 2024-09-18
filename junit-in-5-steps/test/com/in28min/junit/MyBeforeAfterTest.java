package com.in28min.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
		
	}

	@Test
	void test1() {
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}
	
	@Test
	void test3() {
		System.out.println("test3");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
		
	}
	



}
