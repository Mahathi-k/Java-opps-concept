package com.javatopics;

class Member
{
	private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;
    
   public String getName() {
		return name;
	}

  public void setName(String name) 
  {
		this.name = name;
	}

  public int getAge() 
  {
		return age;
	}

 public void setAge(int age) 
 {
		this.age = age;
	}

public long getPhoneNumber() 
{
		return phoneNumber;
	}

public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public double getSalary() {
		return salary;
	}





	public void setSalary(double salary) {
		this.salary = salary;
	}





	public Member(String name, int age, long phoneNumber, String address, double salary) 
	{
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
    
    
    
    
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
