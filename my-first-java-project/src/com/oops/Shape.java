package com.oops;

public class Shape {
	
	public void printshape()
	{
		System.out.println("This is shape");
	}

}
class Rectangle extends Shape
{
	public void printRectangle()
	{
		System.out.println("this is Rectangular shape");
	}
}
class Circle extends Shape
{
	public void printCircle()
	{
		System.out.println("this is circular shape ");
	}
}
class Square extends Rectangle
{
	public void printSquare()
	{
		System.out.println("Square is rectangle");
	}

}



	


	
	

	
	
	

