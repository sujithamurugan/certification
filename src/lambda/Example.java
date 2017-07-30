package lambda;

public class Example {
	Integer i = new Integer(10);
	Example(){
		this.i = 20;
	}
	Example x = new Example();
	Example x1 = x;
	/*Example x1 = new Example();*/
	//x=x1;
	

}
