package testDynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dynamicProgramming.LongestCommonSubsequence;
import dynamicProgramming.LongestIncreasingSubsequence;

public class TestLCSLength {
	
	@Test
	public void testLIS(){
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String str1="ABCDGH";
		String str2="AEDFHR";
		assertEquals("length of longest common subsequence is 3",3, lcs.lengthOfLCS(str1, str2));
		String str3="ABC";
		String str4="EFGGFUYGJ";
		assertEquals("length of longest common subsequence is 0",0, lcs.lengthOfLCS(str3, str4));
		String str5="ABC";
		String str6="ECFGGFUYGJ";
		assertEquals("length of longest common subsequence is 1",1, lcs.lengthOfLCS(str5, str6));
	}

}
