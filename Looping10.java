public class Looping10 {

	public static void main(String[] args) {
		Looping10 loop = new Looping10();
		System.out.println("swapping two number with using third variable");
		loop.print1();
		System.out.println("swapping two number without using third variable");
		loop.print2();
		System.out.println("least common multiple");
		loop.print3(3, 100);
		System.out.println("fibonassi series");
		loop.print4();
	}

	

	private void print1() {
		int no1 = 10, no2 = 20;
		int no3 = no1;
		no1 = no2;
		no2 = no3;
		System.out.println("no1=" + no1);
		System.out.println("no2=" + no2);
		
	}
	private void print2() {
		int no1 = 5, no2 = 10;
				no1 = no1 + no2;//15
				no2 = no1 - no2;//5
				no1 = no1 - no2;//10
				System.out.println("no1="+ no1);
				System.out.println("no2="+ no2);
				}
	private void print3(int no1, int no2) {
		int big = no1>no2?no1:no2;
		while(true)
		{
			if(big%no1 == 0 && big%no2 == 0)
			{
				System.out.println(big);
				break;
			}
			big = big + 1;
		}
		
	}
	private void print4() {
		int first = 0, second = 1, third = 0;
		while(first<25)
		{
			System.out.print(first);
			third = first + second;
			first = second;
			second = third;
		}
		
	}

}

