package com.test;

public class fruits 
{
  static String companyName="ABC food product";
  private String Name;
  private String color;
  private double price;
  
  fruits(String Name,String color,double price)
  {
	  
	  this.Name=Name;
	  this.color=color;
	  this.price=price;
  }
  public fruits()
  {
	  System.out.println("this is default constructor");
  }
  
  public void  display()
  {
	  System.out.println(this.Name+" "+this.color+" "+this.price);
	  
  }
	public static void main(String[] args)
	{
		fruits ob=new fruits("mango","yellow",70);
		fruits ob1=new fruits ("banana","red",80);
		
		ob.display();
		ob1.display();
		
		System.out.println(fruits.companyName);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	{
		

	}

}
