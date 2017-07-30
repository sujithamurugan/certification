package com.javacertification;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPredicate {
	public static Predicate<Student> evaluate()
	{
		return p->p.getMark()>=50;
	}
	public static List<Student> list(List<Student> list,Predicate<Student> p){
		
		return list.stream().filter(p).collect(Collectors.toList());
	
	
	}

}
