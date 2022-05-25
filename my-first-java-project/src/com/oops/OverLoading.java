package com.oops;

public class OverLoading {
	
	public int sum(int x, int y)
	{
		return (x+y);
	}
	public int  sum (int x, int y,int z)
	{
		return (x+y+z);
	}
public double sum (double x ,double y)
{
	return (x+y);
}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		
		System.out.println(o.sum(12, 19));
		System.out.println(o.sum(13, 98, 28));
		System.out.println(o.sum(20.65, 65.98));
		

	}

}
