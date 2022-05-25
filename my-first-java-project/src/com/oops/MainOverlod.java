package com.oops;

public class MainOverlod {

	public static void main(String[] args) 
	{
		
	
	System.out.println("this is main method with String array of argument");	
     main("hello");
	}
	
	public static void main(String Args)
	{
		System.out.println("this is main method with String as an object");
		main("java","application");
		System.out.println(Args);
	}
	
	public static void main(String args1,String args2)
	{
		System.out.println("this method having two string objects");
		System.out.println(args1 +" "+ args2);
	}

}
