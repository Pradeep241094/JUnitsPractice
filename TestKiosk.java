package tddch2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKiosk {
    
	@Test
	public void selectPayment() {
			assertEquals("Credit Card, Debit Card, Cash", Kiosk.SetPayment()); 
		}
	
	@Test
	public void FoodMenu() {
			assertEquals("Ham Burger, Veg Burger, Pasta", Kiosk.FoodMenu()); 
		}
	}
