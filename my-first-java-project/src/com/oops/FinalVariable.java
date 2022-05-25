package com.oops;

public class FinalVariable 
{
	final int a=10;
	
	public void test()
	{
		//this.a=20;
		
		System.out.println(a);
	}
	

	public static void main(String[] args) 
	{
       FinalVariable fn=new FinalVariable();
       System.out.println(fn.a);
       //System.out.println(fn.test());--->cannot print the output  
       //we can use final method to stop inherited

	}

}
