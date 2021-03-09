package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calenderTest {

	@Test (expected = IllegalArgumentException.class)
	   public void testForIllegalArguement()
	   {
	      Calendar.calculateWeekdayOnFirstDayOfYear (1996); // as the function calculates value for for year greater than 2000
	      // the function should execute the exception
	   }
	
	private int[] arrayYears;
	private int[] leapYears;
	
	@Before      // Set up - Called before every test method.
	   public void setUp()
	   {
	      arrayYears = new int[5];
	      leapYears = new int [4];
	   }
	
	 @Test
	   public void testFirstWeekDayOnFirstDayofYear(){
		   arrayYears[0] = 2000;
		   arrayYears[1] = 2016;
		   arrayYears[2] = 2020;
		   arrayYears[3] = 2019;
		   arrayYears[4] = 2012;
		   int[] result = {6, 5, 3, 2, 0}; 
		   for (int i = 0; i < arrayYears.length; i++) { // this iterates the loop by considering the array of years
				   int output = Calendar.calculateWeekdayOnFirstDayOfYear(arrayYears[i]); // output value stores the weekday
				   assertEquals(result[i], output);
			   }
	   } 
	 
	 @Test
	   public void calculateLeapYearTest(){
		 leapYears[0] = 2016;
		 leapYears[1] = 2015;
		 leapYears[2] = 2013;
		 leapYears[3] = 2016;
		   boolean result[] = {true, false, false, true};
				   for (int i = 0; i < leapYears.length; i++) { // this iterates the loop by considering the array of years
				   boolean isLeap = Calendar.isLeapYear(leapYears[i]);
				   assertEquals(result[i], isLeap);
			   }
	   } 
	  
	}
