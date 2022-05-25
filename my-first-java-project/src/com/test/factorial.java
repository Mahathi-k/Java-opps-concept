package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		int number,factorial=1;
	    System.out.println("enter any number");
		number=Integer.parseInt(br.readLine());
		
	 for( int i=1;i<=number;i++)
	 {
		 factorial=factorial*i;   
	 }
	 System.out.println("factorial="+factorial);
	}
}
	 


