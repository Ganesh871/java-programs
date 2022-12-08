package array;

public class Arrayloop9 {

	public static void main(String[] args) {
		Arrayloop9 ar = new Arrayloop9();
		System.out.println("sum of elements equal to 10 given array");
		int[]arr= {10,5,3,7,3,4,2,5,};
		for(int i=0;i<arr.length-1;i++)
		{
		ar.print1(arr, i);
		}
		System.out.println();
		System.out.println("To find first non repeated element an array");
		String name ="GANESH KUMAR G";
		char[]ch=name.toCharArray();
		ar.print2(ch);
		System.out.println();
		System.out.println("divide all element in an array in 3");
		ar.print3();
		System.out.println();
		System.out.println("pubble sorting");
		ar.print4();
		System.out.println();
		System.out.println("binary search");
		ar.print5();		
}
	private void print1(int[] arr, int i) {
		int val=arr[i];
		for(int j =i+1; j<arr.length;j++)
		{
			if(val+arr[j]==10)
			//if(val*arr[j]==20)
			{
				System.out.println(val+"  "+ arr[j]);
			}
	    }
  }
	private void print2(char[] ch) {
	for(int j=0; j<ch.length-1; j++)
	{
		char c =ch[j];
		int count=1;
		for(int i =j+1; i<ch.length; i++)
		{
			if(c==ch[i])
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(c);
			break;
		}
	}
	
	}
	private void print3() {
		int[]arr= {15,45,52,60,32};
		int no=3;
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]%no==0)
			{
			System.out.print(arr[i]+" ");
			}
	    }
		System.out.println();	
   }
	private void print4() {
	System.out.println("before sorting");
	int[]arr= {9,6,5,3,4,8};
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int j =0;j<arr.length;j++)
	{
	
	for(int i=0;i<arr.length-1; i++)
	{
		if(arr[i]>arr[i+1])
	{
		int temp = arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
    }
	}
	System.out.println();
	System.out.println("after sorting");
	for(int i =0;i<arr.length;i++)
	{
	System.out.print(arr[i]+" ");
	}
	System.out.println();
  }
	private void print5() {
		int[]arr={10,12,15,18,20};
		int key = 18;
		int min =0 ,max=arr.length-1;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if (key==(arr[mid]))
			{
			System.out.println("yes got at position "+mid);
			break;
			}
			else if(key>arr[mid])
			{
				min=mid+1;
			}
			else 
			{
				max = mid-1;
			}
		}
		if(min>max)
		{
			System.out.println("no is not present in array");
		}
	}
	
}
