package array;

import java.util.Scanner;

public class Arrayloop2 {

	public static void main(String[] args) {
		Arrayloop2 ar = new Arrayloop2();
		ar.printarray();

	}

	private void printarray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of subjects ");
		int count = sc.nextInt();
		int[] marks = new int[count];
		int total = 0;
		int big = Integer.MIN_VALUE , index1 =0;
		int small = Integer.MAX_VALUE, index2 = 0;
		for(int i = 0; i<marks.length; i++)
		{
			System.out.print("Enter the mark: ");
			marks[i] = sc.nextInt();
			total =total+marks[i];
			if(marks[i]>big)
			{
				big = marks[i];
				index1 = i;
			}
			if(marks[i]<small)
			{
				small = marks[i];
				index2 =i;
			}
		}
		System.out.println("Total mark is "+total);
		System.out.println("Highest mark is "+big+" from subject "+index1);
		System.out.println("Lowest mark is "+small+" from subject "+index2);
	}

}
