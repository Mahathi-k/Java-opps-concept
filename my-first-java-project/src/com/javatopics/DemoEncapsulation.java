package com.javatopics;

class Encapsulation
{

    //private variables declared
    //these can only be accessed  by 
    //public methods of the class
	private String Name;
	private int Age;
	private int  RollNo;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	
	
}


public class DemoEncapsulation {

	public static void main(String[] args) {
		
		Encapsulation ob=new Encapsulation();
        //Setting values of the variables
        ob.setName("Bhusan");
        ob.setAge(23);
        ob.setRollNo(1);
        
        
        //displaying value of the variables
        System.out.println(ob.getName());
        System.out.println(ob.getRollNo());
        System.out.println(ob.getAge());
        
        //Direct access to the name,rollNo and age is not possible due to encapsulation
		

	}

}
