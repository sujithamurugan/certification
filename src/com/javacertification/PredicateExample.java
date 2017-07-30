package com.javacertification;

import java.util.ArrayList;

public class PredicateExample {
	public static void main(String[] args) {
	
		Student obj = new Student();
		Student obj2 =new Student();
		Student obj3 =new Student();
		
		obj.setMark(40);
		obj.setName("Sankar");
		obj.setId(1);
		obj2.setMark(50);
		obj2.setName("Vicky");
		obj2.setId(2);
		obj3.setMark(60);
		obj3.setName("Raj");
		obj3.setId(3);
		
		
		ArrayList <Student> list =new ArrayList<>();
		list.add(obj);
		list.add(obj2);
		list.add(obj3);
		System.out.println(list);
		
		//StudentPredicate.evaluate();
		System.out.println(StudentPredicate.list(list,StudentPredicate.evaluate() ));
		
		
	}

}
