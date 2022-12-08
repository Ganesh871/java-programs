package array;

public class Arrayloop4 {

	public static void main(String[] args) {
		Arrayloop4 array = new Arrayloop4();
		System.out.println("copying only negative number given array to another array");
		int[]ar1= {10, 20 ,-30,-40, -50};
		 int count = array.print(ar1);
		 System.out.println("count of negative number "+count);
		 array.print2(ar1, count);

	}
	private int print(int[] ar1) {
		int count =0;
		for(int i=0;i<ar1.length; i++)
		{
		if(ar1[i]<0)
		{
			count++;
		}
		}
		return count;
			
	}
	private void print2(int[] ar1, int count) {
		int[] ar2 = new int[count];
		int j =0;
		for(int i =0; i<ar1.length; i++)
		{
			if(ar1[i]<0)
			{
				ar2[j]=ar1[i];
				System.out.print(ar2[j]+" ");
				j++;
			}
		}
		
	}
	
	}

