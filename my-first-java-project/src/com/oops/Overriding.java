package com.oops;

class Superclass
	{
		void show()
	{
		System.out.println("this is parentclass");
	}
}	

class Subclass extends Superclass
{
	void show()
	{
		System.out.println("this is child class");
	}
}
	 
public class Overriding 
{

	public static void main(String[] args) 
	{
		Superclass sp=new Superclass();
		sp.show();
		
		Superclass p1=new Subclass();//runtime polymorphism is achieved over subclass(child class)
        p1.show();
	}

}
