package com.test;

import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

import junit.framework.Assert;

public class BuffetTest {

	
	public int number;
	Buffet buf = new Buffet();
	@Before
	public void before() {
		this.number = 0;
		this.buf = new Buffet();
	}
	
	@Test
	public void getNumberFormsetNumberbyNumber() {
		this.number = 5;
		
		int expected = 5;
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		Assert.assertEquals(expected, actual);
	}
	
	public void getNumberFormsetNumberbyNumber2() {
		this.number = 0;
		
		int expected = 0;
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		Assert.assertEquals(expected, actual);
	}
	

}
