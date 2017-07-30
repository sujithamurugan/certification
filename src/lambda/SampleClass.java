package lambda;

public class SampleClass{
	
	
    public static void main(String[] args) {
    /*}    	
    }
	AnotherSampleClass asc = new AnotherSampleClass();
	SampleClass sc = new SampleClass();
	sc=asc;
*/
	int x = 5;

	while(isAvailable(x))
	{
System.out.println(x);
		x--;
		}
    }

    public static boolean isAvailable(int x ){
    
	return x-- >0?true:false;
}
	
    }	
	


