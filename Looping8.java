public class Looping8{

	public static void main(String[] args) {
		Looping8 loop = new Looping8();
		loop.print1();

	}

	private static void print1() {
		int no1 = 1;
		int count = 1;
		while(count<=4)
		{
			int no2= no1-1;
			System.out.print(no1+" "+no2+" ");
			count = count+1;
			
		}
		
		
		
	}

}

