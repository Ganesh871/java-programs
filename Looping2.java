public class Looping2 {

	public static void main(String[] args) {
		Looping2 loop = new Looping2();
		System.out.println("multiple of 3 and 5");
		loop.print1();
		System.out.println("multiple of 3 0r 5");
		loop.print2();
		System.out.println("addition of first n numbers");
		loop.print3();
		}
	
	

	void print1()
	{
	int no=1;
	while(no<=30)
	{
		if(no%3==0 && no%5==0)
		{
			System.out.println(no+" ");
		}
		no=no+1;
	}
	

}
	void print2() {
		int no=1;
		while (no<30)
		{
			if(no%3==0 || no%5==0)
			{
			System.out.println(no+" ");	
			}
			no=no+1;
		}
		
	}
	void print3() {
		int sum=0;
		int no=1;
		while(no<=10)
		{
			sum=sum+no;
			no=no+1;
		}
		System.out.println(sum);
	}
}

