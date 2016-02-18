import static org.junit.Assert.*;

import org.junit.Test;

//import MYCalculator.Calculator;


public class MyTester {

	@Test
	public void testNfactorial() {
		Calculator calc = new Calculator();
		int actual = calc.nfactorial(5);
		assertEquals("Expected 5! = 120", 120, actual, 0.0);
	}

	@Test
	public void testBinarySearch() {
		fail("Not yet implemented");
	}

}
