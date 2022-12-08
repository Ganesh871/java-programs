package array;

public class Arrayloop7 {

	public static void main(String[] args) {
		Arrayloop7 ar = new Arrayloop7();
		System.out.println("moving all elements towards right");
		ar.print1();
	}

	private void print1() {
		int[]ar = {10,20,30,40};
		System.out.println("index length "+ar.length);
		System.out.print("before shifting :");
		for(int i=0; i<ar.length; i++)
		{
		System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("after shifting :");
		int temp=ar[ar.length-1];
		for(int i=ar.length-1; i>0; i--)
		{
			
			ar[i]=ar[i-1];
			System.out.print(ar[i]+" ");
		}
		System.out.println(temp);
		
		
	}

}
