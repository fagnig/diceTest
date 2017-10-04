package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import terning.Dice;

public class testDice {
	Dice d1;
	@Before
	public void setUp() throws Exception {
		d1 = new Dice();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRollBounds() {
		int antalTerningKast = 60000;
		
		for (int i=1; i<=antalTerningKast; i++) {
			if (d1.roll()<1 && d1.roll()>6) {
				fail("outside bounds");
			}
		}
		
	}

	@Test
	public void testRollAccuracy() {
		int antalTerningKast = 60000;
		int count[] = new int[6];
		
		//Rolling the dice
		for (int i=1; i<=antalTerningKast; i++) {
			count[d1.roll()-1]++;
		}
		
		//Printing for user
		for (int i=0; i<=5; i++) {
			System.out.println(count[i]);
		}
		
		//Ensuring it's inside legal limits
		for (int i=0; i<=5; i++) {
			assertTrue("outside threshhold", count[i]>=9600);
			assertTrue("outside threshhold", count[i]<=10400);
		}
	}

}
