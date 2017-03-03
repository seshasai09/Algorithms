package basics;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestBinaryAddition {
	@Test
	public void testBinaryAddition(){
		BinaryAddition ba = new BinaryAddition();
		List<Integer> number1 = ba.convertToList("111");
		List<Integer> number2 = ba.convertToList("111");
		String sol = convertToString(ba.addition(number1, number2));
		assertEquals("answer should have been","1110",sol);
		 number1 = ba.convertToList("110101");
		 number2 = ba.convertToList("100011");
		 sol = convertToString(ba.addition(number1, number2));
		assertEquals("answer should have been","1011000",sol );
	}
	
	private String convertToString(List<Integer>list){
		String ans="";
		for(int i :list){
			ans=ans+String.valueOf(i);
		}
		
		return ans;
	}

}
