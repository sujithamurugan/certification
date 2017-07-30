package com.javacertification;

public class Auto  {
public void fly(int num)
{
	System.out.println("primitive");
	}
Auto(){
	super();
	
}
public void fly(Integer num){
	System.out.println("wrapper");
}
public static void main(String[] args) {
	Auto a = new Auto();
	a.fly(3);
	a.fly(5);
	a.fly(new Integer(4));
}
}
