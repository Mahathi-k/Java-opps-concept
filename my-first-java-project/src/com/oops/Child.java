package com.oops;

public class Child implements Three {

	@Override
	public void test() {
    System.out.println("this is test method");
		
	}

	@Override
	public void demo() {
	System.out.println("this is Demo method");	
		
	}

	@Override
	public void Sample() {
		System.out.println("this is Sample method");
		
		
	}
	
	public static void main (String args[]) 
	{
		Child c=new Child();
		c.demo();
		c.test();
		c.Sample();
	}

}
