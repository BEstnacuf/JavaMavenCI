package com.test;

import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

import junit.framework.Assert;

public class CalculateTest {
	
	public int score;
	public Calculate cal ;
	
	@Before
	public void intiScoreZero() {
		this.score = 0 ;
	}
	
	@Before
	public void intCalculateClass() {
		this.cal = new Calculate();
	}
	
	@Test
	public void getScoreFromScoreByScore() {
		this.score = 100;
		
		int expected = 100;
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
		
		
	}

	@Test
	public void getScoreFromScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void gradeAFromsetScoreAndCalcilateByScore100() {
		this.score = 100;
		
		String expected = "A";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void gradeAFromsetScoreAndCalcilateByScore90() {
		this.score = 90;
		
		String expected = "A";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void gradeAFromsetScoreAndCalcilateByScore80() {
		this.score = 80;
		
		String expected = "A";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}

	@Test
	public void gradeBPlutFromsetScoreAndCalcilateByScore79() {
		this.score = 79;
		
		String expected = "B+";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void gradeBPlutFromsetScoreAndCalcilateByScore70() {
		this.score = 70;
		
		String expected = "B";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void gradeBPlutFromsetScoreAndCalcilateByScore69() {
		this.score = 69;
		
		String expected = "C+";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}

	@Test
	public void gradCPlutFromsetScoreAndCalcilateByScore65() {
		this.score = 65;
		
		String expected = "C+";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void gradeCFromsetScoreAndCalcilateByScore60() {
		this.score = 60;
		
		String expected = "C";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	public void gradeDPlutFromsetScoreAndCalcilateByScore59() {
		this.score = 59;
		
		String expected = "D+";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	public void gradeDPlutFromsetScoreAndCalcilateByScore55() {
		this.score = 55;
		
		String expected = "D+";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	public void gradeDFromsetScoreAndCalcilateByScore54() {
		this.score = 54;
		
		String expected = "D";
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	
}
