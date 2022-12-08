package array;

public class Arrayloop6 {

	public static void main(String[] args) {
		Arrayloop6 ar = new Arrayloop6();
		System.out.println("removed index elements from given array ");
		ar.print1();
}

	private void print1() {
		int[]ar= {10,20,30,40,50,60};
		int key = 30; 
		int index=-1;
		
		for(int i =0; i<ar.length; i++)
		{
			if(ar[i]==key)
			{
				index=i;
				break;
			}
			System.out.print(ar[i]+" ");
			
		}
		//System.out.println("index : "+index);
		
		for(int i= index+1; i<ar.length; i++)
		{
		System.out.print(ar[i]+" ");
		}
		
	}
	
	
	
	
}
