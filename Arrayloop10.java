package array;

import java.util.Scanner;

public class Arrayloop10 {

	public static void main(String[] args) {
		Arrayloop10 ar = new Arrayloop10();
		System.out.println("two dimensional array example program");
		ar.print1();
	}

	private void print1() {
		int[][]marks = new int[3][5];
		//System.out.println("length "+marks.length);
		//System.out.println(marks[0].length);
		Scanner sc = new Scanner(System.in);
		//for(int row=0;row<3;row++)
		for(int row=0;row<marks.length;row++)
		{
			int big = Integer.MIN_VALUE;
			int small=Integer.MAX_VALUE;
		    int examtotal=0;
		   //for(int col=0;col<5;col++)
			for(int col=0; col<marks[row].length;col++)
			{
				System.out.print("Enter mark: ");
				marks[row][col]=sc.nextInt();
				examtotal = examtotal+marks[row][col];
				if(marks[row][col]>big)
				{
					big = marks[row][col];
					
				}
				if(marks[row][col]<small)
				{
					small=marks[row][col];
					
				}
				
			}
			System.out.println("total mark is "+examtotal);
			System.out.println("biggest mark is "+big);
			System.out.println("lowest mark is "+small);
		}
	}

}
