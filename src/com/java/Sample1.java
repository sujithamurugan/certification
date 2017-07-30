package com.java;

public class Sample1 {
	
	//System.out.println(name);
	private static String name = "suji";
	
	{
		System.out.println("instance1");
	}
	static {
		System.out.println("hello");
	}
	void display()
	{
	System.out.println("instance method");	
	}
	{
		System.out.println("instance2");
	}
	static void methodEX(){
		System.out.println("static method");
	}
	static{
		
		System.out.println("static");
	}
	public Sample1()
	{
		Sample1 s1 = new Sample1();
	System.out.println("inside constructor");	
	}
	
public static void main(String[] args) {
	/*System.out.println(name);*/
	Sample1 s = new Sample1();
	methodEX();
	s.methodEX();
	s.display();
	Sample1.methodEX();

}
}
