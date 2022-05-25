package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class petersonnumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		int number,factorial=1,sumOffactorial=0,rem;
		System.out.println("enter any number");
		number=Integer.parseInt(br.readLine());
		int copyOfnumber=number;
		
		while(number>0)
		{
			rem=number%10;
			int i=1;
			while(i<=rem)	
			{
				factorial=factorial*i;
						i=i+1;
			}
			sumOffactorial=sumOffactorial+factorial;
			number=number/10;
			factorial=1;
		}
		
       if(sumOffactorial==copyOfnumber)
       {
    	   System.out.println("it is a peterson number");
       }
       else 
       {
    	 System.out.println("it is not a peterson number");  
       }
	}

}
