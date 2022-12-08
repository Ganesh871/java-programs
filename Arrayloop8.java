package array;

public class Arrayloop8 {

	public static void main(String[] args) {
		Arrayloop8 ar = new Arrayloop8();
		System.out.println("printing first repeated element");
		ar.print1();
		System.out.println();
		System.out.println("frequency of array");
        ar.print2();
	}
	private void print1() {
		int[]ar= {10,3,5,10,8};
		boolean repeat = false;
		for(int j = 0; j<ar.length-1; j++)
		{
		int key= ar[j];
		for(int i=j+1; i<ar.length; i++)
		{
		if(key==ar[i])
		{
			System.out.print("repeated first element "+ar[i]);
			repeat=true;
			break;
		}
		}
		if(repeat==true)
			break;
	}
		System.out.println();
}
	private void print2() {
		int[]ar= {10,20,30,40,50,10,20,30,40,50,10,30,30,80};
		int []freq = new int[ar.length];
		for(int i =0;i<ar.length;i++)
		{
			int no = ar[i];
			int count = 1;
			for(int j =i+1;j<ar.length; j++)
			{
				if(no==ar[j])
				{
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]>-1)
			{
			freq[i]=count;
			} 
			if(freq[i]>0)
			{
				 System.out.println(ar[i]+" called "+freq[i]+" times");	
			}
	}
  }
}
