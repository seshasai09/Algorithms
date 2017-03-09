package dynamicProgramming;

public class MinCostPath {
	
	public int minCostPath(int[][] maze){
		
		int sol[][]= new int[maze.length][maze[0].length];
		sol[0][0]=maze[0][0];
		for(int i=1;i<maze.length;i++)
			sol[i][0]=sol[i-1][0] + maze[i][0];
		for(int i=1;i<maze.length;i++)
			sol[0][i]=sol[0][i-1] + maze[0][i];
		
		for(int i=1;i<maze.length;i++){
			for(int j=1;j<maze[i].length;j++){
				sol[i][j]= Math.min(sol[i-1][j-1],sol[i][j-1]);
				sol[i][j]= maze[i][j]+Math.min(sol[i][j],sol[i-1][j]);	
			}
		}
		
		return sol[maze.length-1][maze[0].length-1];
		
	}

}
