public class Looping3 {

	public static void main(String[] args) {
		Looping3 loop = new Looping3();
		System.out.println("divisions of given numbers");
		loop.print1();
		System.out.println("count of divsion given number");
		loop.print2();
		System.out.println("finding prime number");
		loop.print3();
	}

	 void print1() {
		int no=100;
		int div=2;
		while(div<=no)
		{
			if(no%div==0)
			{
         System.out.println(div);		
         
	}
			div=div+1;
}
	 }
	private void print2() {
		int no=100;
		int count =0;
		int div=2;
		while(div<no)
		{
			if(no%div==0)
			{
			
			count=count+1;
			
		}
		div= div+1;
	}
		System.out.println(count);
	}
      void print3() {
    	  int no=13;
  		int count =0;
  		int div=2;
  		while(div<no)
  		{
  			if(no%div==0)
  			{
  			
  			count=count+1;
  			
  		}
  		div= div+1;
  	}
  		System.out.println("number of divisors "+count);
  		if(count==0)
  			System.out.println("prime number");
  		else
  			System.out.println("not prime number");
  	}
		
	}

	

