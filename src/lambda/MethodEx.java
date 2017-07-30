package lambda;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
				 ROW_LOOP: for(int row = 1; row <=3; row++)
				 for(int col = 1; col <=2; col++) {
				 if(row * col % 2 == 0) continue ROW_LOOP;
				 count++;
				 }
				 System.out.println(count);
				 
				 boolean b1 = true;
				 boolean b2 = false;
				 System.out.println(b1);
				
	}

}
