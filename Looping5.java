public class Looping5 {

	public static void main(String[] args) {
		Looping5 loop = new Looping5();
		System.out.println("finding out common no of two given number");
		loop.print1();
		System.out.println("greatest common division two given number");
		loop.print2();
		System.out.println("find palindrome no");
		loop.print3();
		
	}
	void print1() {
	 int no1=100 , no2=120;
	 int div=2;
	 while(div<no2)
	 {
		 if(no1%div==0 && no2%div==0)
		 {
			 System.out.println(div);
		 }
		 div= div+1;
	 }
	}
	private void print2() {
		int no1=100 , no2=120;
		int div=2;
		int gcd=0;
		int small= no1<no2? no1:no2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
			}
			div= div+1;
		}
		System.out.println(gcd);
	}
	
		
	
	private void print3() {
		int no =12321;
		 int no2 = no;
		int rev = 0;
		while(no>0)
		{
			int rem = no%10;
			rev = (rev*10)+rem;
			no = no/10;
		}
		System.out.println(no2);
		if(no2==rev)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");
	}
	
		
	}



