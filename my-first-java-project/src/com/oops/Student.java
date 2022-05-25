package com.oops;

public class Student {
	private String Name;
	private int Age;
	private String Address;
	
	Student()
	{
		
		this.Name="unknown";
		this.Age=0;
		this.Address="NotAvailabile";
	}
	
  public void setInfo(String Name,String Address)
  {
	  this.Name=Name;
	  this.Address=Address;
  }
  
  public void setInfo(String Name,String Address,int Age)
  {
	  this.Name=Name;
	  this.Address=Address;
	  this.Age=Age;
  }
	

	@Override
public String toString() {
	return "Student [Name=" + Name + ", Age=" + Age + ", Address=" + Address + "]";
}

	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println(s);
		
		Student s1=new Student();
		s1.setInfo("Mahathi", "nandyal");
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setInfo("srinidhi", "Hyderabad", 25);
		System.out.println(s2);
		
		

	}

}
