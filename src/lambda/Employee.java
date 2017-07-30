package lambda;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	Employee(){
		
	}
	
Employee(int id,String name)
{
	this.id= id;
    this.name=name;
	
	
}


public  void show() {
	Employee[] emp = new Employee[5];
	
	for (int i=0;i<=4;i++){
		Scanner s = new Scanner(System.in);
		System.out.println("enter id");
		id=s.nextInt();
		System.out.println("enter name");
		name=s.next();
		emp[i]=Employee(id,name);
	}

	
}


private Employee Employee(int i, String string) {
	// TODO Auto-generated method stub
	return null;
}
public static void main(String[] args) {
	Employee empl= new Employee();
	empl.show();
	
}
}
