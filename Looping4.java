public class Looping4 {

	public static void main(String[] args) {
		Looping4 loop = new Looping4();
		System.out.println("reverse printing number");
		loop.print1();
		System.out.println("count of digits");
        loop.print2();
        System.out.println("sum of digits");
        loop.print3();
        System.out.println("reverse the number");
		loop.print4();
		System.out.println("find factorial");
		loop.print5();
		System.out.println("find factorials");
		loop.print6(5);
        
	}
	  
	void print1() {
		 int no=1234;
		 while(no>0)
		 {
			 System.out.println(no%10);
			 no= no/10;
		 }
		
	}
	void print2() {
		int no=1234;
		int count=0;
		 while(no>0)
		 {
			 count=count+1;
			 no= no/10;
		 }	
		 System.out.println(count);
		
	}
     void print3() {
	 int no=1234;
	 int sum=0;
	 while(no>0)
	 {
		 int rem=no%10;
		 sum=sum+rem;
		 no=no/10;
	 }
	 System.out.println(sum);
		
	}
     private void print4() {
 		int no = 1234;
 		int rev = 0;
 		while(no>0)
 		{
 			int rem = no%10;
 			rev = (rev*10)+rem;
 			no = no/10;
 		}
 		System.out.println(rev);



}
     void print5() {
 		int max = 4;
 		int fact = 1;
 		int no =1;
 		while(no<=max)
 		{
 			fact = fact*no;
 			no =no + 1;
 		}
 			System.out.println(fact);
 		}
     private void print6(int max) {
    	  while (max>=1)
    	 {
  		int fact = 1;
  		int no =1;
  		while(no<=max)
  		{
  			fact = fact*no;
  			no =no + 1;
  		}
  			System.out.println(fact);
  			max = max-1;
  		}
 		
 	}
}

