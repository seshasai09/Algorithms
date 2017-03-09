package basics;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGcd {
	
	@Test
	public void testGcd(){
		Gcd gcd = new Gcd();
		assertEquals("GCD of 25 and 11 is 1",1, gcd.computeGcd(25, 11));
		assertEquals("GCD of 1035 and 759 is 69",69, gcd.computeGcd(1035, 759));
		
	}

}
