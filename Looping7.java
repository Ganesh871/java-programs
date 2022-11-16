public class Looping7 {

	public static void main(String[] args) {
		Looping7 loop = new Looping7();
		System.out.println("table");
		loop.print1();
		System.out.println("printing 1*10, 2*9, 3*8 ,4*7 5*6");
		loop.print2();
		System.out.println("square root of given number");
		loop.print3();
		System.out.println("smallest divisor of given number");
		loop.print4();
		System.out.println("greatest divisor of given number");
		loop.print5();
		System.out.println("printing 10, 18 ,24, 28, 30");
		loop.print6();

	}
	
	

	


	void print1() {
	int no1=1;
	int no2=10;
	while(no1<=5)
	{
		System.out.println(no1 +"*"+no2+"="+(no1*no2));
		no1=no1+1;
	}
		
	}
	void print2() {
		int no1=1;
		int no2=10;
		while(no1<=5)
		{
			System.out.println(no1 +"*"+no2+"="+(no1*no2));
			no1=no1+1;
			no2=no2-1;
		}
		
	}
	void print3() {
		int no=56;
		int div=2;
		while(div<=no/2)
		{
		if(no/div<=div)
		{
			System.out.println(div);
			break;
		}
		div=div+1;
	}


}
	void print4() {
		int no=27;
		int div=2;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				break;
			}
			div=div+1;
		}
	}
	void print5() {
	int no=1000;
	int div= no/2;
	while(div<no)
	{
	  System.out.println(div);
			div= div+1;
		break;
	}
		
	}
	private void print6() {
		int no1=10 ,no2=8;
		while(no2>=0)
			
		{
			System.out.print(no1+" ");
			no1= no1+no2;
			no2= no2-2;
		}
		
	}

}

