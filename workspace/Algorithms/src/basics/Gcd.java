package basics;

public class Gcd {
	
	public int computeGcd(int x, int y){
		if(y==0)
			return x;
		else
			return computeGcd(y, x%y);
	}

}
