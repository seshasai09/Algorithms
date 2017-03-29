package dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class CoinChange {
	int k=0;
	Set<Integer> p = new HashSet<Integer>();
	
	public void coinChange(int n, int[] coins){
		if(n==0)
			k=k+1;
		else{
			for(int i=0;i<coins.length;i++){
					if(n-coins[i]>=0)
						coinChange(n-coins[i], coins);
			}
		}
	}
	
	public void coinChangeDP(int n,int[]coins){
		int sol[][] = new int[n+1][coins.length+1];
		for(int i=0;i<coins.length+1;i++)
			sol[0][i]=0;
		for(int i=0;i<n+1;i++)
			sol[i][0]=0;
		sol[0][0]=1;
		
		for(int i=1;i<n+1;i++){
			for(int j=1;j<coins.length+1;j++){
				if(i<coins[j-1]){
					sol[i][j]=sol[i][j-1];
				}else if(i==coins[j-1]){
					sol[i][j]=1+sol[i][j-1];
				}else{
					sol[i][j] = sol[i-j][j] + sol[i][j-1];
				}
			}
		}
		
		System.out.println( sol[n][coins.length]);
	}
	
	
	public static void main(String[] args){
		CoinChange cc = new CoinChange();
		int coins[] ={2, 5, 3, 6};
		int n=10;
		//cc.coinChange(n, coins);
		cc.coinChangeDP(n, coins);
		
		System.out.println(cc.k);
	}

}
