package com.java;

public class Test {
 {
	int[] countsOfMoose = new int[3];
	 int num = countsOfMoose[-1];
	 System.out.println(num);
 }
 static {
	 int[] countsOfMoose = new int[3];
	 int num = countsOfMoose[-1];
	 System.out.println(num);
	 }
 public static void main(String[] args) {
	Test t = new Test();
	//t.test();
}
}
