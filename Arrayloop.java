package array;

public class Arrayloop {

	public static void main(String[] args) {
		Arrayloop ad=new Arrayloop();
		int[]values= {49,61,50,55,62,92};
		System.out.println("index length "+values.length);
		System.out.println("printing array");
		ad.printarray(values);
		System.out.println();
		System.out.println("printing reverse order");
		ad.printarray2(values);
		System.out.println();
		System.out.println("printing less than 50");
		ad.printarray3(values);
		System.out.println();
		System.out.println("printing greater than 50");
		ad.printarray4(values);
		System.out.println();
		System.out.println("equal to 50");
	    ad.printarray5(values);
	    System.out.println();
	    System.out.println("multiples of 7");
	    ad.printarray6(values);
	    System.out.println();
	    System.out.println("find even index (or) element");
	    ad.printarray7(values);
	    System.out.println();
	    System.out.println("find ood index number(or) element");
	    ad.printarray8(values);
	    System.out.println();
	    System.out.println("linear search: find 50 and 62");
	    ad.printarray9(values, 50, 62);
	    System.out.println();
	    System.out.println("count of given element in array");
	    ad.printarray10(values);
	    System.out.println();
	    System.out.println("printing only even index elements");
	    ad.printarray11(values);
	    System.out.println();
	    System.out.println("printing only odd index elements");
	    ad.printarray12(values);
	    System.out.println();
	    System.out.println("printing even number present in even elements");
	    ad.printarray13(values);
	    System.out.println();
	    System.out.println("printing odd number present in odd elements");
	    ad.printarray14(values);
	    
		}
	
	private void printarray(int[] values) {
		int total=0;
		for(int i=0;i<values.length; i++)
		{
			System.out.println(values[i]);
			total=total+values[i];
		}
		System.out.println("total values "+total);
		System.out.println("percentage "+total/values.length);
	}
	private void printarray2(int[] values){
		for(int i=values.length-1; i>=0; i--)
		{
			System.out.println(values[i]);
		}
	
}
	private void printarray3(int[] values) {
		 int no=50;
		for(int i=0; i<values.length; i++)
		{
			if(values[i]<no)
			System.out.println(values[i]);
		}
		
	}
	private void printarray4(int[] values) {
		 int no=50;
			for(int i=0; i<values.length; i++)
			{
				if(values[i]>no)
				System.out.println(values[i]);
				
			}
			
	}
	private void printarray5(int[] values) {
		int no=50;
		for(int i=0; i<values.length; i++)
		{
			if(values[i]==no)
			System.out.println(values[i]);
		}
		
	
}
	private void printarray6(int[] values) {
		int no=7;
		for(int i=0; i<values.length; i++)
		{
			if(values[i]%no==0)
			System.out.println(values[i]);
		}
		
		
	}
	private void printarray7(int[] values) {
		for(int i=0; i<values.length; i+=2)
		{
			System.out.println(values[i]);
		}
	}
	private void printarray8(int[] values) {
		for(int i=1; i<values.length; i+=2)
		{
			System.out.println(values[i]);
		}
		
	}
	private void printarray9(int[] values, int key1, int key2) {
		for(int i=0; i<values.length; i++)
		{
			if(values[i]==key1 || values[i]==key2) {
			System.out.println(values[i]);
			}
		
	    }
	}
	private void printarray10(int[] values) {
		int key = 50;
		int count =0;
		for(int i =0; i<values.length; i++)
		{
			if(values[i]==key) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
	private void printarray11(int[] values) {
		for(int i = 0; i<values.length; i++)
		{
			if(i%2==0)
			{
				System.out.println("the even index is "+i+" ");
				System.out.println("the even index element value is "+values[i]+" ");
			}
		}
	}
	private void printarray12(int[] values) {
		for(int i = 0; i<values.length; i++)
		{
			if(i%2!=0)
			{
				System.out.println("the odd index is "+i+" ");
				System.out.println("the odd index element value is "+values[i]+" ");
			}
		}
	}
	private void printarray13(int[] values) {
		int total = 0;
		for(int i = 0; i<values.length; i++)
		{
			if(i%2==0 && values[i]%2==0)
			{
				System.out.println(values[i]);
				total = total+values[i];
			}
		}
		System.out.println("addition of even index elements "+total);
	}

	private void printarray14(int[] values) {
		int total = 0;
		for(int i = 0; i<values.length; i++)
		{
			if(i%2!=0 && values[i]%2!=0)
			{
				System.out.println(values[i]);
				total = total+values[i];
			}
			}
		System.out.println("addition of ood index elements "+total);
		
	}

	

	


}

	


