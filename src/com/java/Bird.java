package com.java;

public class Bird {
	protected String text = "floating"; // protected access
	protected void floatInWater() { // protected access
	System.out.println(text);
	}
	public static void main(String[] args) {
		Bird b = new Bird();
		b.floatInWater();
		System.out.println(b.text);
	}
}
