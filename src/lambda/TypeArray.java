package lambda;

import java.util.Arrays;


public class TypeArray {
	StringBuilder sb = new StringBuilder();
public static void main(String[] args) {
	int[] array ={1,2,3,4,5};
	System.arraycopy(array,2,array,1,3);
	System.out.println(array.length);
	String arr = Arrays.toString(array);
	System.out.println(arr.toString());
	System.out.println(array[1]);
	System.out.println(array[4]);
}
}
