package testDynamicProgramming;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import dynamicProgramming.LongestIncreasingSubsequence;

public class TestLongestIncreasingSubsequence {
	
	@Test
	public void testLIS(){
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		int list1[] =  {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int list2[] ={10, 22, 9, 33, 21, 50, 41, 60, 80};
		int list3[] = {3, 10, 2, 1, 20};
		int list4[] = {1,2,3,4,5,6,7};
		int list5[] = {6,5,4,3,2,1};
		
		assertEquals("length of longest subsequence is 6",6, lis.lis(list1));
		assertEquals("length of longest subsequence is 6",6, lis.lis(list2));
		assertEquals("length of longest subsequence is 3",3, lis.lis(list3));
		assertEquals("length of longest subsequence is 7",7, lis.lis(list4));
		assertEquals("length of longest subsequence is 0",0, lis.lis(list5));
	}
	

}
