package lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Simple {
	/* static int count;
	 static void display()
	{
		 count = 6;
		 //System.out.println(count);
	}
	 static void show(){
		// System.out.println(count);
	 }
	 void instanceMethod()
	 {
		 Simple.display();
	 }*/
	private static final ArrayList<String> values = new ArrayList<>();
	private static ArrayList<String> values1 = new ArrayList<>();
	public static void main(String[] args) {
		values.add("changed");
		
		values.set(0,"suji");
		Object[] array = values.toArray();
		String s=Arrays.toString(array);
		System.out.println(s.toString());
		System.out.println(values);
	//Simple.count=4;
		//Simple s = new Simple();
	
		//Simple.count=6;
		//s.count=5;
		//display();
		//show();
		//instanceMethod();*/
		
		
		
		
		
		
		
		//System.out.println(s.count);
	}
		
	
	}


