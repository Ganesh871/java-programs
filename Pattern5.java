package patternprogram;

public class Pattern5 {

	public static void main(String[] args) {
		Pattern5 loop = new Pattern5();
		System.out.println();
		loop.patternA();
		System.out.println();
		loop.patternB();
		System.out.println();
	    loop.patternC();
		System.out.println();
	    System.out.println();
	    loop.patternD();
	    System.out.println();
		loop.patternE();
		System.out.println();
		loop.patternF();
		System.out.println();
		loop.patternG();
		System.out.println();
		loop.patternH();
		System.out.println();
	    loop.patternI();
	    System.out.println();
	    loop.patternJ();
	    System.out.println();
	    loop.patternK();
	    System.out.println();
	    loop.patternL();
		

	}
	
	private void patternA() {
		for(int col=1; col<=6; col++)
		{
			if(col==1)
		System.out.print(" ");
			else
				System.out.print(" *");
		}
		System.out.println();
		for(int row=1; row<=9; row++)
		{
			if(row!=5) {
			System.out.print("* ");
			for(int space=1; space<=10;space++)
			{
				System.out.print(" ");
			}
			System.out.println("* ");
			}
			else
			{
				for(int col=1; col<=7; col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		 }
		
	}
	private void patternB() {
		for(int col=1; col<=6; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1; row<=10; row++)
		{
			if(row!=5) {
			System.out.print("* ");
			for(int space=1; space<=10;space++) {
				System.out.print(" ");
			}
			System.out.println("* ");
			}
			else
			{
				for(int col=1; col<=6; col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		 }
		for(int col=1; col<=6; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	
		}
	private void patternC() {
		for(int col =1; col<=5; col++)
		{
				System.out.print(" ");
			System.out.print("*");
		}
		System.out.println();
		for(int row=1; row<=4; row++)
		{
			
		System.out.println("*");
	    }
		for(int col =1; col<=5; col++)
		{
			System.out.print(" ");
			System.out.print("*");
			
		}
		System.out.println();
	}
	private void patternD() {
		for(int col =1; col<=5; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1; row<=5; row++)
		{
		System.out.print("* ");
		for(int i = 1; i <=4; i++)
		{
			System.out.print("  ");
		}
		System.out.println("*");
	    }
		for(int col =1; col<=5; col++)
		{
			System.out.print("* ");
		}
      System.out.println();
		}
	
	private void patternE() {
		for(int col=1; col<=7; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1; row<=9; row++)
		{
			if(row!=5) {
			System.out.println("*");
			}
			else
			{
				for(int col=1; col<=5; col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		 }
		for(int col=1; col<=7; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	
		}
	private void patternF() {
		for(int col=1; col<=7; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1; row<=10; row++)
		{
			if(row!=5) {
			System.out.println("*");
			}
			else
			{
				for(int col=1; col<=5; col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		 }
		
	}
	private void patternG() {
		for(int row=1;row<=10;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || row==10 ||col==1)
				System.out.print("* ");
				else if(col==7 && row>=6)
					System.out.print("* ");
				else if(row==5 && col>=4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	private void patternH() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1 || col==7 ||row==5)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	private void patternI() {
		for(int col =1; col<=7; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1; row<=5; row++)
		{
		for(int i = 1; i <=3; i++)
		{
			System.out.print("  ");
		}
		System.out.println("*");
	    }
		for(int col =1; col<=7; col++)
		{
			System.out.print("* ");
		}
      System.out.println();
  }
	private void patternJ() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 ||col==4 || row==9 && col<=4)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	private void patternK() {
		for(int row=1;row<=10;row++)
		{
			for(int col=1;col<=6;col++)
			{
				if(col==1 ||row+col==7 ||row-col==4)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	private void patternL() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1 || row==9)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}


}


	


