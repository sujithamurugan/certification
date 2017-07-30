package lambda;

public class Owl implements Nocturnal{
	/*public boolean isBlind(){
		
		return true;
		}*/
	public static void main(String[] args) {
		/*Nocturnal ns = new Owl();
		System.out.println(ns.isBlind());
		
	}*/
		int x=3;
		int y= (++x*4/x--)+(--x);
		System.out.println("y+x is"+(y+x));
	}
	

}
