package com.javacertification;

public class TestImm extends Immutable {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("initial");
		Immutable problem = new Immutable();
		TestImm im = new TestImm();
		im.display();
		//sb.append(" added");
		//StringBuilder gotBuilder = problem.getBuilder();
		//gotBuilder.append(" more");
		System.out.println(problem.getBuilder());
		//System.out.println(probuilder);
	}
	private int display(){
		System.out.println(this.getBuilder());
		return 0;
	}
	}



