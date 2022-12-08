package string;

public class String2 {

	public static void main(String[] args) {
		String2 st = new String2();
		st.print1();

	}

	private void print1() {
		String name = "ramar";
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			char ch=name.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(name.equals(rev))
		{
			System.out.println("palinrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}
		
	}

}
