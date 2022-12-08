package string;

public class Stringdemo {

	public static void main(String[] args) {
		Stringdemo st = new Stringdemo();
		st.print1();
	}

	private void print1() {
		String name="ganeshkumar";
		System.out.println("length "+name.length());
		System.out.print(name.charAt(0));
		System.out.print(name.charAt(1));
		System.out.print(name.charAt(2));
		System.out.print(name.charAt(3));
		System.out.print(name.charAt(4));
		System.out.print(name.charAt(5));
		System.out.println();
		for(int i = 0; i<name.length(); i++)
		{
		System.out.print(name.charAt(i));	
		}
		
	}
	

}
