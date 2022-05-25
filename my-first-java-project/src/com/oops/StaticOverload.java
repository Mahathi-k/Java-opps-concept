package com.oops;

public class StaticOverload {
	
	public static int test(int a)
	{
		return 10;
	}
public static int test (int b,int c)
{
	return 'b' ;
	
}
	public static void main(String[] args) {
		
		StaticOverload so=new StaticOverload();
		System.out.println(so.test(1));
		System.out.println(so.test(11, 12));

	}

}
