package patternprogram;

public class Pattern7 {
public static void main(String[] args){
  Pattern7 loop = new Pattern7();
  loop.patternM();
  System.out.println();
  loop.patternN();
  System.out.println();
  loop.patternO();
  System.out.println();
  loop.patternP();
  System.out.println();
  loop.patternQ();
  System.out.println();
  loop.patternR();
  System.out.println();
  loop.patternS();
  System.out.println();
  loop.patternT();
  System.out.println();
  loop.patternU();
  System.out.println();
  loop.patternV();
  System.out.println();
  loop.patternW();
  System.out.println();
  loop.patternX();
  System.out.println();
  loop.patternY();
  System.out.println();
  loop.patternZ();
}
private void patternM() {
	for(int row=1;row<=9;row++)
	{
		
		for(int col=1;col<=9;col++)
		{
			if(col==1  ||col==9)
			System.out.print("* ");
			else if(row==col && row<=5)
				System.out.print("* ");
			else if(row+col==10 && row<=col)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
}

private void patternN() {
	for(int col=1;col<=9;col++)
	{
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9)
			   System.out.print("* ");
			else if(row==col)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
   }
private void patternO() {
	for(int row=1;row<=10;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(col==1 || col==7 ||row==1 || row==10)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
   } 
private void patternP() {
	for(int row=1;row<=12;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(col==1 || row==1 || row==6)
			System.out.print("* ");
			else if(col==7 && row<=6)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
  }
private void patternQ() {
	for(int row=1;row<=11;row++)
	{
		for(int col=1;col<=10;col++)
		{
			if(col==1 && row<=8||col==7 && row<=8)
			System.out.print("* ");
			else if(row==1 && col<=7 ||row==8 && col<=7)
			System.out.print("* ");
			else if(row==col && row>=6)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
   }
private void patternR() {
  for(int row=1;row<=12;row++)
  {
	  for(int col=1;col<=7;col++)
	  {
		  if(col==1 || col==7 && row<=6)
		  System.out.print("* ");
		  else if(row==1 || row==6)
			  System.out.print("* ");
		  else if(row-col==5)
			  System.out.print("* ");
		  else
			  System.out.print("  ");
	  }
	  System.out.println();
  }
	
  }
private void patternS() {
	for(int row=1;row<=13;row++)
	{
		for(int col=1;col<=8;col++)
		{
			if(row==1 || row==7|| row==13)
			System.out.print("* ");
			else if(col==1 && row<=6 || col==8 && row>=7)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
  }
private void patternT() {
	
		for(int col =1; col<=9; col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1; row<=7; row++)
		{
		for(int i = 1; i <=4; i++)
		{
			System.out.print("  ");
		}
		System.out.println("*");
	    }
		System.out.println();
  }
private void patternU() {
	for(int row=1;row<=10;row++)
	{
		for(int col=1;col<=8;col++)
		{
			if(col==1 || col==8 ||row==10)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	}
private void patternV() {
	for(int row=1;row<=7;row++)
	{
		for(int col=1;col<=13;col++)
		{
			if(col==row && col<=7)
			System.out.print("* ");
			else if(row+col==14 && col>=7)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
  }
private void patternW() {
	for(int row=1;row<=9;row++)
	{
		
		for(int col=1;col<=9;col++)
		{
			if(col==1 || col==9)
			System.out.print("* ");
			else if(row+col==10 && col<=5)
			System.out.print("* ");
			else if(row==col && col>=5)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
  }
private void patternX() {
	for(int row=1;row<=9;row++)
	{
		
		for(int col=1;col<=9;col++)
		{
			if(row==col)
				System.out.print("* ");
			else if(row+col==10)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	}
private void patternY() {
	for(int row=1;row<=9;row++)
	{
		
		for(int col=1;col<=9;col++)
		{
			if(row==col && col<=5)
			System.out.print("* ");
			else if(row+col==10 && col>=5)
				System.out.print("* ");
			else if(col==5 && row>=5)
				System.out.print("* ");
			else
				System.out.print("  ");
			
		}
		System.out.println();
	}
	
  }
private void patternZ() {
	for(int row=1;row<=9;row++)
	{
		
		for(int col=1;col<=9;col++)
		{
			if(row==1 || row==9)
			System.out.print("* ");	
			else if(row+col==10)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
  }
}


