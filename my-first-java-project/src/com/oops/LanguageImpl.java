package com.oops;

public class LanguageImpl implements Language{

	@Override
	public void Responsive() {
		System.out.println("FrontEnd must be Responsive");
		
	}

	@Override
	public void ConnectToServer() {
		System.out.println("BackEnd must be connected to server");
		
	}

	@Override
	public void WriteCode() {
		System.out.println("Language must helps to write code ");
		
		}
	
	public static void main(String args[])
	{
		Language l=new LanguageImpl();
		l.Responsive();
		l.ConnectToServer();
		l.WriteCode();
	}

}
