package lambda;

import com.sujipreparation.suji.Pelican;

public class Bird {
	static int  bar = 10;
protected  void fly(){
	System.out.println("Bird is flying");
}
void display(){
	System.out.println("display");
}

	
	

public static void main(String[] args) {
	Bird b1 = new Pelican();
	b1.fly();
	Bird b2 = new Pelican();
	b2.fly();
}
}
