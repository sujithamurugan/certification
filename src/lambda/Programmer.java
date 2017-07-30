package lambda;

public class Programmer extends Writer{
	 int a=20;
   void write(){
	 // a=20;
	   System.out.println(a);
	   System.out.println("writing code");
   }
public static void main(String[] args) {
	Writer obj = new Programmer();
	//Writer w = (Programmer)obj;
	obj.write();
	System.out.println(obj.a);
	
}
}
