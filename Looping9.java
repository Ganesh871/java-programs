public class Looping9 {

	public static void main(String[] args) {
		Looping9 loop = new Looping9();
		System.out.println("sum of digits until become single digits");
		loop.print1(12345);
		System.out.println("perfect number");
		loop.print2();
		System.out.println("find power 2 power 5");
		int result = loop.print3(2, 5);
		System.out.println(result);
		System.out.println("binary to decimal");
		loop.print4(1010);
		System.out.println("decimal to binary");
		loop.print5(6);
	}
	  
	private void print1(int no) {
	    	 
	    	 int sum=0;
	    	 while(no>0)
	    	 {
	    		 int rem=no%10;
	    		 sum=sum+rem;
	    		 no=no/10;
	    	 }
	    	 System.out.println(sum);
	    	 if(sum>9)
	    	 {
	    		 print1(sum);
	    	 }
	    		
	 		
	 	}
	   
	private void print2() {
		int no = 6;
		int div= 1;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div+" ");
			}
			div= div+1;
		}
		
	}
	private int print3(int base , int power) {
		
		int result = 1;
		while(power>=1)
		{
			result = result*base;
			power = power-1;
		}
		return result;
	}
	private void print4(int binary) {
		
		int decimal =0;
		int power= 0;
		while(binary>0)
		{
			int rem = binary%10;
			int value = rem * print3(2, power);
			decimal = decimal+value;
			binary = binary/10;
			power = power +1;
		}
		System.out.println(decimal);
	}
	private void print5(int decimal) {
		String binary = "";
		while(decimal>0)
		{
			int rem = decimal%2;
			binary = rem+binary;
			decimal = decimal/2;
		}
		System.out.println(binary);
		
	}

	
}

