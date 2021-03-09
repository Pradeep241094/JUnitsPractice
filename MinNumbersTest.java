package calcInClass;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class MinNumbersTest {
	private int[] aNumbers;
	
	   @Before      // Set up - Called before every test method.
	   public void setUp()
	   {
	      aNumbers = new int[6];
	   }
	   
	   //Test case for throwing Array Index out of bound Exception
	   @Test (expected = ArrayIndexOutOfBoundsException.class)
	   public void testForIndexOutOfBounds()
	   {
	      MinNumbers.min (aNumbers, 0, 6);

	   }
	   // Test case to throw illegal argument exception
	   @Test (expected = IllegalArgumentException.class)
	   public void illegelArguements() {
		      MinNumbers.min (aNumbers, 9, 5);
	   }

	   
	   @Test
	   public void testMin(){
		   aNumbers[0] = 7;
		   aNumbers[1] = 5;
		   aNumbers[2] = 6;
		   aNumbers[3] = 8;
		   aNumbers[4] = 5;
		   aNumbers[5] = 9;
		   int output = MinNumbers.min(aNumbers, 3, 5);
		   assertEquals(5,output);
	   } 
	   
	   @Test
	   public void testCase2(){
		   aNumbers[0] = 7;
		   aNumbers[1] = 5;
		   aNumbers[2] = 6;
		   aNumbers[3] = 8;
		   aNumbers[4] = 5;
		   aNumbers[5] = 8;
		   int output = MinNumbers.min(aNumbers, 0, 5);
		   assertEquals(5,output);
	   } 
	   
}