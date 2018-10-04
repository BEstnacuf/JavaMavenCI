package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class DemoTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void Test1() {
		Assert.assertTrue(true);
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		Assert.assertTrue(true);
		System.out.println("Test2");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
}
