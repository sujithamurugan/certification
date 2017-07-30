package com.java;

public class Holder {
	   int value = 1;
	   Holder link;
	   public Holder(int val){ this.value = val; }
	   public static void main(String[] args){
	    final Holder a = new Holder(5);
	    Holder b = new Holder(10);
	    a.link = b;
	    b.link = setIt(a, b);
	    System.out.println(a.value+" "+b.value);
	   }
	   
	   public static Holder setIt(final Holder x, final Holder y){
	       x.value = y.value;
	       return x;
	   }
	   
	
}
