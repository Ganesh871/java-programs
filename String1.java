package string;

public class String1 {

	public static void main(String[] args) {
		String1 st = new String1();
		System.out.println("reverse printing string");
		st.print1();
		System.out.println();
		System.out.println("check first letter g");
		st.print2();
		System.out.println();
		System.out.println("count of letters");
		st.print3();
		System.out.println();
		System.out.println("count of one character in given string");
		st.print4();
		System.out.println();
		System.out.println("count of vowels");
		st.print5();
		System.out.println();
		System.out.println("printing only number in string");
		st.print6();
		System.out.println();
		System.out.println("print only character in string");
		st.print7();
		System.out.println();
		System.out.println("print only special character in string");
		st.print8();
		System.out.println();
		System.out.println("convert string to char array");
		st.print9();
		System.out.println();
		System.out.println("convert string to integer");
		st.print10("12345");
		System.out.println();
		System.out.println("sum of number from given string");
		st.print11();
		System.out.println();
		System.out.println("convert chararray to string");
		st.print12();
				
		

	}
	
	private void print1() {
		String name = "ganeshkumar";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	private void print2() {
		String name = "ganesh kumar";
		char ch=name.charAt(0);
		if(ch=='g')
		{
		System.out.println("yes");
		}
		else 
			System.out.println("no");
	}
	private void print3() {
		String name="ganeshkumar";
		System.out.println(name.length());
		}
	private void print4() {
		String name= "ganesh kumar";
		char ch= 'a';
		int count = 0;
		for(int i =0;i<name.length();i++)
		{
			if(ch==name.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
    }
	private void print5() {
		String name ="ganesh kumar";
		int count=0;
		for(int i =0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||
			   name.charAt(i)=='e'||
			   name.charAt(i)=='i'||
			   name.charAt(i)=='o'||
			   name.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	private void print6() {
		String name = "ganesh0123459";
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='0' && name.charAt(i)<='9')
			{
				System.out.print(name.charAt(i)+" ");
			}
		}
		System.out.println();
	}
	private void print7() {
		String name = "ganesh12345";
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='a' && name.charAt(i)<='z')
			{
				System.out.print(name.charAt(i)+" ");
			}
		}
		System.out.println();
	}
	private void print8() {
		String name = "ganeshkumar@gmail.com";
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='a' && name.charAt(i)<='z')
			{  }
		else if(name.charAt(i)>='0' && name.charAt(i)<='9')
		{  }
		else
			System.out.print(name.charAt(i)+" ");
	   }
		System.out.println();
    }
	private void print9() {
		String name= "ganeshkumar";
		char[]ch=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	private void print10(String string) {
		int no=Integer.parseInt(string);
		System.out.println(no);
	}
	private void print11() {
		String name="ganesh12345";
		int sum =0;
		for(int i =0;i<name.length();i++)
		{
		if(name.charAt(i)>='0' && name.charAt(i)<='9')
		{
			char ch=name.charAt(i);
			int no = Character.getNumericValue(ch);
			System.out.print(no);
			sum=sum+no;
		}
	    }
		System.out.println();
		System.out.println("sum of digits "+sum);
	}
	private void print12() {
		char[]name = {'g','a','n','e','s','h'};
		String s = new String(name);
		System.out.println(s);
		
	}
}

