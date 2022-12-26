package patternprogram;

public class Pattern6 {

	public static void main(String[] args) {
		Pattern6 loop =new Pattern6();
		System.out.println("printing 0 to 9 using pattern program");
		System.out.println();
		loop.print0();
		System.out.println();
	    loop.print1();
		System.out.println();
		loop.print2();
		System.out.println();
		loop.print3();
		System.out.println();
		loop.print4();
		System.out.println();
		loop.print5();
		System.out.println();
		loop.print6();
		System.out.println();
		loop.print7();
		System.out.println();
		loop.print8();
		System.out.println();
		loop.print9();
		
	}
	private void print0() {
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int row=1;row<=9;row++)
		{
			if(row!=5)
			System.out.print("* ");
			else
				System.out.print("  ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			if(row!=5)
			System.out.println("* ");
			else
				System.out.println("  ");
		}
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
	private void print1() {
		for(int row=1; row<=9;row++)
		{
			for(int space=1;space<=6;space++)
			{
				System.out.print("  ");
			}
			if(row!=5)
			System.out.println("* ");
			else
				System.out.println(" ");
		}
		
	}
	private void print2() {
		for(int col=1; col<=6;col++)
		{
			if(col!=1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int row=1;row<=4;row++)
		{
		for(int space=1; space<=6;space++)
		{
			System.out.print("  ");
		}
		System.out.println("*");
		}
		for(int col=1; col<=6;col++)
		{
			if(col!=1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int row=1;row<=4;row++)
		{
			
		System.out.println("*");
			
		}
		for(int col=1; col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		
		
		
	}
	private void print3() {
		for(int col =1; col<=6; col++)
		{
			if(col!=1)
		System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		
		for(int row=1;row<=9;row++)
		{
			if(row!=5)
			{
				System.out.print("  ");	
				for(int space =1; space<=5; space++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}
			else
			{
				for(int col=1;col<=6;col++)
				{
					if(col==1)
						System.out.print("  ");
					else
					System.out.print("* ");
				}
				System.out.println();
			}
		
		}
		for(int col =1; col<=6; col++)
		{
			if(col!=1)
		System.out.print("* ");	
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	private void print4() {
		
		for(int row=1;row<=4;row++)
		{
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for(int col=1;col<=7;col++)
		{
			
			if(col!=1 && col!=7)
			{
			System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
		for(int row=1;row<=4;row++)
		{
		for(int space=1;space<=6;space++)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
	}	
	private void print5() {
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int row=1;row<=4;row++)
		{
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int col=1;col<=4;col++)
		{
			for(int space=1;space<=6;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}	
	
	private void print6() {
		for(int col=1; col<=7;col++) 
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int row=1;row<=4;row++)
		{
			System.out.println("*");
		}
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int row=1;row<=4;row++)
		{
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for(int row=1;row<=7;row++)
		{
			if(row!=1 && row!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	private void print7() {
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		
		for(int col=1;col<=9;col++)
		{
		for(int space=1;space<=6;space++)
			{
			System.out.print("  ");
			}
		if(col!=5)
			System.out.println("* ");
		else
			System.out.println("  ");
		}
	}

	private void print8() {
		for(int col =1; col<=6; col++)
		{
			if(col!=1)
		System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		
		for(int row=1;row<=9;row++)
		{
			if(row!=5)
			{
				System.out.print("* ");	
				for(int space =1; space<=5; space++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}
			else
			{
				for(int col=1;col<=6;col++)
				{
					if(col==1)
						System.out.print("  ");
					else
					System.out.print("* ");
				}
				System.out.println();
			}
		
		}
		for(int col =1; col<=6; col++)
		{
			if(col!=1)
		System.out.print("* ");	
			else
				System.out.print("  ");
			
		}
		System.out.println();
	}
	private void print9() {
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int col=1;col<=4;col++)
		{
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		for(int col=1;col<=4;col++)
		{
			for(int space=1;space<=6;space++)
			{
				System.out.print("  ");	
			}
			System.out.println("* ");
		}
		for(int col=1;col<=7;col++)
		{
			if(col!=1 && col!=7)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
}
