package com.javacertification;

public class Immutable {
	private StringBuilder builder;
	/*public Immutable(StringBuilder builder) {
	this.builder = builder;
	}*/
	public StringBuilder getBuilder() {
	return builder;
	 }
	private void display()
	{
		System.out.println("disp");
	}
	/*public  StringBuilder setBuilder(StringBuilder builder){
		return this.builder=builder;
	}
*/
}