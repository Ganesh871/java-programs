public class Looping4 {

	public static void main(String[] args) {
		Looping4 loop = new Looping4();
		System.out.println("reverse printing number");
		loop.print1();
		System.out.println("count of digits");
        loop.print2();
        System.out.println("sum of digits");
        loop.print3();
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



}

