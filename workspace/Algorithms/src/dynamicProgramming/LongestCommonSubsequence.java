package dynamicProgramming;

public class LongestCommonSubsequence {
	
	public int lengthOfLCS(String str1, String str2){
		int sol[][]=new int[str2.length()+1][str1.length()+1];
		for(int i=0;i<str1.length()+1;i++)
			sol[0][i]=0;
		for(int i=0;i<str2.length()+1;i++)
			sol[i][0]=0;
		for(int i=1;i<str2.length()+1;i++){
			for(int j=1;j<str1.length()+1;j++){
				if(str2.charAt(i-1)==str1.charAt(j-1)){
						sol[i][j]=sol[i-1][j-1]+1;
				}else
					sol[i][j]=Math.max(sol[i-1][j], sol[i][j-1]);
			}
		}
		return sol[str2.length()][str1.length()];
	}

}
