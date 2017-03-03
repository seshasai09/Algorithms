package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinaryAddition {
	
	
	public BinaryAddition(){
		
	}
	
	public List<Integer> convertToList(String num){
		List<Integer>sol = new ArrayList<Integer>();
		if (num.isEmpty())
			return null;
		for(int i=0;i<num.length();i++){
			sol.add(i,Character.getNumericValue(num.charAt(i))) ;
		}
		
		return sol;
	}
	
	public List<Integer> addition(List<Integer> num1, List<Integer> num2){
		int i=num1.size()-1;
		int j=num2.size()-1;
		int k = 0;
		int carry=0;
		List<Integer>sol = new ArrayList<Integer>();
		try{
		while(i>=0 && j>=0){
			if(num1.get(i)==1 && num2.get(j)==1){
				if( carry==0){
				sol.add(k++, 0);
				carry=1;
				}else{
					sol.add(k++, 1);
					carry=1;
				}
			}else if(num1.get(i)==0 && num2.get(j)==0){
				if(carry==1){
					sol.add(k++, 1);
					carry=0;
					}else{
						sol.add(k++, 1);
						carry=0;
					}
			
			}else{
				if(carry==0){
					sol.add(k++, num1.get(i)+num2.get(j));
				}else{
					sol.add(k++, 0);
					carry=1;
				}
			}
			i--;
			j--;
				
		}
		num1 = (i>=j) ? num1:num2;
		i= max(i,j);
		while(i>=0){
			if(carry==1){
				if(num1.get(i)==1){
				sol.add(k++, 1);
				carry=1;
				}else{
					sol.add(k++, 1);
					carry=0;
				}
			}else{
				sol.add(k++, num1.get(i));
			}
			i--;
		}
		
		if(carry==1)
			sol.add(k++, 1);
		}catch(Exception e){
			System.out.println(sol.size());
			e.printStackTrace();
		}
		
		 Collections.reverse(sol);
		 return sol;
		
	}
	
	private int max(int i, int j){
	return i > j ? i:j;
	}
	

}
