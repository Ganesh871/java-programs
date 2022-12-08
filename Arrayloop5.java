package array;

public class Arrayloop5 {

	public static void main(String[] args) {
	Arrayloop5 ar =new Arrayloop5();
	System.out.println("shifting all element  towards left in given array");
	ar.print1();
	System.out.println();
	System.out.println("moving all  element towards left in twice ");
	int[]ar1= {10, 20, -30, -40, 50};
	
	for(int count=1; count<=2; count++ )
	{
		ar1=ar.print2(ar1);	
	for(int i =0; i<ar1.length; i++)
		{
		System.out.print(ar1[i]+" ");
		}
	 System.out.println();
	}
 }
	private void print1() {
		int[]ar= {10,20,30,40};
		System.out.print("before shifting :");
		for(int i =0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int temp = ar[0];
		System.out.print("after shifting :");
		for(int i= 0; i<ar.length-1; i++)
		{
			ar[i]=ar[i+1];
		   System.out.print(ar[i]+" ");
		}
		System.out.print(temp);
		System.out.println();
		}
	
	private int[] print2(int[] ar1) {
		
		System.out.print("before shifting :");
		for(int i =0; i<ar1.length; i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.print("after shifting :");
		int temp = ar1[0];
		int i =0;
		while(i<ar1.length-1)
		{
			ar1[i]=ar1[i+1];
			i++;
		}
				ar1[i]=temp;
	    return ar1;
	   }
}

