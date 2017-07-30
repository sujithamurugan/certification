package lambda;

public class RowExample {

	public static void main(String[] args) {
		StringBuilder b =  new StringBuilder("rumble");
				b.append(4).deleteCharAt(3).delete(3, b.length()- 1);
				
				System.out.println(b);
	}
	}
		/*int count = 0;
				ROW_LOOP: for(int row = 1;row <=3;row++)
				 for(int col = 1; col <=2 ;col++) {
				 if(row * col % 2 == 0) continue ROW_LOOP;
				 count++;
				 }
				 System.out.println(count);
	}
}*/
		// TODO Auto-generated method stub
//		/*int count = 0;
//		 ROW_LOOP: for(int row = 1; row <=3; row++)
//		 for(int col = 1; col <=2 ; col++) {
//		if(row * col % 2 == 0) continue ROW_LOOP;
//		 count++;
//		 }
//		 System.out.println(count);
//	}
//}*/
	/*int count = 0;
			4: ROW_LOOP: for(int row = 1; row <=3; row++)
			5: for(int col = 1; col <=2 ; col++) {
			6: if(row * col % 2 == 0) continue ROW_LOOP;
			7: count++;
			8: }
			9: System.out.println(count

}*/
