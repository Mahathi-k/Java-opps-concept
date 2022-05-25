package com.oops;

public class BikeImplementation implements Bike 
{

	@Override
	public void test() 
	{
		System.out.println("this is test method");
		
	}

	@Override
	public void demo() 
	{
		System.out.println("this is test method");
		
	}

	
  public static void main (String args[])
  {
  
  Bike bike=new BikeImplementation();
  
   bike.demo();
   bike.test();
  
  
}
}
