package dynamicProgramming;

public class LongestIncreasingSubsequence {
	
	public int lis(int[] list){
		int [] buffer = new int[list.length];
		int maxLenCurr =0;
		for(int i=1;i<list.length;i++){
			for(int j=i-1;j>=0;j--){
				if(list[j]<list[i] && buffer[i]<buffer[j]+1){
					buffer[i]=buffer[j]+1;
					//System.out.println(buffer[i]);
					maxLenCurr =  Math.max(buffer[i],maxLenCurr);
					
				}
			}
			
		}
		/*for(int i : buffer)
			System.out.println(i);*/
		maxLenCurr = maxLenCurr >0 ? maxLenCurr+1 : maxLenCurr;
		
		return maxLenCurr;
	}

}
