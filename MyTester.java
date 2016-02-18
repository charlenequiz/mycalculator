import static org.junit.Assert.*;

import org.junit.Test;

//import MYCalculator.Calculator;


public class MyTester {

	@Test
	public void testNfactorial() {
		Calculator calc = new Calculator();
		int actual = calc.nfactorial(5);
		assertEquals("Expected 5! = 120", 120, actual, 0.0);
		
		actual = calc.nfactorial(4);
		assertEquals("Expected 4! = 24", 24, actual, 0.0);
		
		actual = calc.nfactorial(3);
		assertEquals("Expected 3! = 6", 6, actual, 0.0);
		
		actual = calc.nfactorial(2);		
		assertEquals("Expected 2! = 2", 2, actual, 0.0);
		
		actual = calc.nfactorial(1);
		assertEquals("Expected 1! = 1", 1, actual, 0.0);
	}

	@Test
	public void testBinarySearch() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		Calculator calc = new Calculator();
		int actual = calc.binarySearch(arr, 0);
		assertEquals("Expected -1", -1, actual, 0.0);
		
		actual = calc.binarySearch(arr, 2);
		assertEquals("Expected 1", 1, actual, 0.0);
		
		actual = calc.binarySearch(arr, 4);
		assertEquals("Expected 3", 3, actual, 0.0);
		
		actual = calc.binarySearch(arr, 6);
		assertEquals("Expected 5", 5, actual, 0.0);
	}

}
