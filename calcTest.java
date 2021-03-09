package calcInClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcTest {

	
	@Test
	public void testAdd() {
		assertTrue("Calc Addition incorrect", 10 == Calc.add(4, 6));
	}

	@Test
	public void testMultiply() {
		assertTrue("Calc multiply incorrect", 24 == Calc.multiply(4, 6));
	}
	
	@Test 
	public void testSubtraction() {
		assertTrue ("Calc Program is not computing the subtraction", 5 == Calc.subtraction(15, 10));
	}
	
	// Code refactoring
	@Test 
	public void testSubtraction2() {
		assertTrue ("Calc Program is not computing the subtraction", 7.5 == Calc.subtraction(15, 7.5));
	}
	
	@Test
	public void test1Division() {
		assertTrue("Calc Program is not computing the division operation", 5 == Calc.division(10,2));
	}
	
	// code refactoring
	// evolved test case handling for floating point numbers

	@Test
	public void testDivision() {
		assertTrue("Calc Program is not computing the division operation", 5 == Calc.division(12.5,2.5));	
	}
	
	@Test
	public void testRemainder() {
		assertTrue("Calc Program is not computing the division operation", 0 == Calc.remainder(10,2));	
	}
}