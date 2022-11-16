public class Looping6 {

	public static void main(String[] args) {
		Looping6 loop = new Looping6();
		
		System.out.println("first 20 prime number");
		int no =2;
		int primecount=0;
		loop.print1(no , primecount);
	}

	private void print1(int no, int primecount) {
		int div =2;
		int count=0;
		while(div<no)
		{
			if(no%div==0)
			{
				count=count+1;
				break;
			}
			div = div+1;
		}
		if(count==0)
		{
			System.out.println(no);
			primecount=primecount+1;
		}
		no = no+1;
		if(primecount<20)
		{
			print1(no , primecount);
		}
	}
}

	
