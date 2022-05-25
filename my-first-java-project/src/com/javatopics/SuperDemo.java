package com.javatopics;

 

	
	class A
	{
		int a=10;
		A()
		{
			System.out.println("this is parent class");
		}
		
		
		public void test()
		{
			System.out.println("value of:" +a);
		}
	}
	class Body extends A
	{
		Body()
		
		{
			super();
			System.out.println("this is child class");
			System.out.println(super.a);
			super.test();
		}
	}
	
	public class SuperDemo 
	{

	public static void main(String[] args) 
	{
		
		Body ob=new Body();

	}

}
