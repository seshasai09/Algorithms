package testDynamicProgramming;

import org.junit.Test;

import dynamicProgramming.MinCostPath;

import static org.junit.Assert.assertEquals;

public class TestMinCost {
	
	@Test
	public void testMinCost(){
		MinCostPath tmc = new MinCostPath();
	
		int cost[][] = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
		assertEquals("minimum cost to reach the cell 2,2 is 8",8, tmc.minCostPath(cost));
		int cost2[][] = { {1, 2, 3,4},
                {0, 1, 2,3},
                {0, 4, 0,6},
                {5,6,7,0}};
		assertEquals("minimum cost to reach the cell 3,3 is 2",2, tmc.minCostPath(cost2));
		
	}

}
