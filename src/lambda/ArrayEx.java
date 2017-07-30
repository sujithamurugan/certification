package lambda;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][][] x = new int[3][][];
int i,j;
x[0] =  new int[4][];
x[1] =  new int[2][];
x[2] =  new int[5][];
for(i=0;1<x.length;i++){
	for(j=0;j<x[i].length;j++){
		x[i][j]=new  int[i+j+1];
		
		System.out.println("size="+x[i][j].);
	}
}
	}

}
