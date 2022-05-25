package com.test;

public class employee {
	
	private int employeeID;
	private String firstName;
	private String lastName;
	private int Salary;
	
	employee( int employeeID,String firstName,String lastName,int Salary)
	{
		
		
		this.employeeID=employeeID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Salary=Salary;
		
		
	}
	

	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", Salary=" + Salary + "]";
	}


	public static void main(String[] args) 
	{
		
		employee obj=new employee( 1234,  "kakshya",  "Mahathi",  30000);
		System.out.println(obj.getEmployeeID());
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getSalary());
		

	}

}
