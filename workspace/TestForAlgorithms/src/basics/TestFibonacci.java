package basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestFibonacci {
	@Test
	public void testFibonacci(){
		Fibonacci fib = new Fibonacci();
		assertEquals("fibonacci of 1 is 1",fib.fibRecursive(1), fib.fibDP(1));
		assertEquals("fibonacci of 5 is 8",fib.fibRecursive(5), fib.fibDP(5));
		assertEquals("fibonacci of 8 is 34",fib.fibRecursive(8), fib.fibDP(8));
	}

}
