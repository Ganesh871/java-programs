package array;

public class Arrayloop3 {

	public static void main(String[] args) {
		Arrayloop3 ar = new Arrayloop3();
		System.out.println("biggest and second biggest in given array");
		ar.print1();
		System.out.println();
		System.out.println("smallest and second smallest in given array");
		ar.print2();
		System.out.println();
		System.out.println("copying the number given number to another array reverse order");
		ar.print3();
		System.out.println();
		System.out.println("finding only negative number in given array");
		ar.print4();
		System.out.println();
		System.out.println("printing values between adjacent two elements in given array");
		ar.print5();
		System.out.println();
		System.out.println("addion of two integer array");
		ar.print6();
		
	}
	
	private void print1() {
		int[]ar= {15,12,14,18};
		int big1 = Integer.MIN_VALUE , big2 = Integer.MIN_VALUE;
		for(int i = 0; i<ar.length; i++)
		{
		   if(ar[i]>big1)
		   {
				big2=big1;
			   big1=ar[i];
		   }
		   else if(ar[i]<big2)
		   {
	        big2=ar[i];
		 }
		 }
		System.out.println("first big is "+ big1+" second big is "+big2);
     }
	private void print2() {
		int[]ar= {-15,-12,-14,-18};
		int small = Integer.MAX_VALUE , small2 = Integer.MAX_VALUE;
		for(int i = 0; i<ar.length; i++)
		{
		   if(ar[i]<small)
		   {
				small2=small;
			   small=ar[i];
		   }
		   else if(ar[i]<small2)
		   {
	        small2=ar[i];
		 }
		 }
		System.out.println("first small is "+ small+" second small is "+small2);
		}
	private void print3() {
		int[]ar1= {15,12,14,18};
		int[]ar2= new int[ar1.length];
		 int j = ar1.length-1;
		 for(int i = 0; i<ar1.length; i++)
		 {
			 ar2[i]=ar1[j];
			 System.out.print(ar2[i]+" ");
			 j--;
		 }
		 System.out.println();
		}
	private void print4() {
		int count = 0;
		int[]ar= {10, 20 ,-30,-40, -50};
		
		for(int i=0;i<ar.length; i++)
		{
		if(ar[i]<0)
		{
			System.out.print(ar[i]+" ");
			count++;
		}
		}
		System.out.println();
		System.out.println("count of negative number "+count);
	}
	private void print5() {
		int ar[]= {3,8,2,7,12};
		for(int j = 0; j<ar.length; j++){
			{
				int small=ar[j]<ar[j+1]?ar[j]:ar[j+1];
				int big = ar[j]>ar[j+1]?ar[j]:ar[j+1];
				for(int i = small; i<=big; i++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
		    }
		}
    }
	private void print6() {
		int[]a= {10,20,30};
		int[]b= {10,20,30,40,50,60,70};
		int big = a.length>b.length?a.length:b.length;
		int small= a.length<b.length?a.length:b.length;
		int[] c= new int[big];
		for(int i=0; i<small;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		for(int i = small; i<big; i++)
		{
			c[i]=b[i];
			System.out.print(c[i]+" ");
		}
		
	}
}
	
	


	
