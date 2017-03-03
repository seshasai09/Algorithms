package basics;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fibonacci {
	
	
	public static void main(String[] args){
		
		System.out.println("enter the term to which you want to see the fib series");
		Scanner sn = new Scanner(System.in);
		int n =sn.nextInt();
		Fibonacci fib = new Fibonacci();
		// invoking recursive algorithm
		System.out.println(fib.fibRecursive(n));
		// invoking DPP algorithm
		System.out.println(fib.fibDP(n));
		
	}
	
	/**
	 *  recursive impplementation of fibonacci
	 * @param n 
	 * @return return nth term of the Fibonacci
	 */
	public long fibRecursive(int n){
		if(n == 0 || n == 1)
			return 1;
		else
			return fibRecursive(n-1) + fibRecursive(n-2);
	}
	
	/**
	 * iterative implementation of Fibonacci
	 * @param n
	 * @return returns nth term of the fibonacci
	 */
	
	public long fibDP(int n){
		long[] sol = new long[n+1];
		sol[0]=1;
		sol[1]=1;
		for(int i=2;i<=n;i++)
			sol[i] = sol[i-1] + sol[i-2];
		return sol[n];
		
	}

}
