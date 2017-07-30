package com.java;

public class TestShow extends Show1{
	 public TestShow(){
			super(34);
			// this(4);
		 }
 public TestShow(int num){
	// super(4);
	this();
	 this.display();
}

 public static void main(String[] args) {
	 
	Show1 ts = new TestShow(5);
	TestShow ts1 = new TestShow();
}
}
