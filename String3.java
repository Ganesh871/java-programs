package string;

public class String3 {

	public static void main(String[] args) {
		String3 st = new String3();
		System.out.println("find count of sentence and words");
		st.print1();
		System.out.println();
		System.out.println("change lower case and upper case");
		st.print2();
		System.out.println();
		System.out.println("print name with numbers");
		st.print3();
		System.out.println();
		System.out.println("print only odd character are capital letter");
		st.print4();
		System.out.println();
		System.out.println("print only even numbers are capital letter");
		st.print5();

	}
	private void print1() {
		int space = 0;
		String sentence="today is sunday";
		for(int i =0;i<sentence.length();i++)
		{
		  if(sentence.charAt(i)==' ')
		{
			space++;
		}
		}
		space=space+1;
		System.out.println("count of sentences :"+space);
		int countofwords = sentence.length()-space+1;
		System.out.println("count of words :"+countofwords);
		
	}
	private void print2() {
		System.out.println("change lower to upper");
		String name = "ganeshkumar";
		for(int i =0;i<name.length();i++)
		{
			char ch =name.charAt(i);
			//System.out.print(ch-32+" ");  //ASCII values
			System.out.print((char)(ch-32));
		}
		System.out.println();
		System.out.println("change upper to lower");
		String name2 = "GANESHKUMAR";
		for(int i =0;i<name.length();i++)
		{
			char ch =name2.charAt(i);
			//System.out.print(ch+32+" ");  //ASCII values
			System.out.print((char)(ch+32));
		}
		System.out.println();
	}
	private void print3() {
		String name = "ganeshkumar12345";
		for(int i =0;i<name.length();i++)
		{
			char ch =name.charAt(i);
			if(ch>='a' && ch<='z') 
			{
			System.out.print((char)(ch-32));
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println();
		String name1 = "GANESHKUMAR12345";
		for(int i =0;i<name.length();i++)
		{
			char ch =name1.charAt(i);
			if(ch>='A' && ch<='Z') 
			{
			System.out.print((char)(ch+32));
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println();
	}
	private void print4() {
		String name = "ganeshkumar";
		for(int i =0;i<name.length();i++)
		{
			char ch =name.charAt(i);
			if(i%2==0)
			{
			if(ch>='a' && ch<='z') 
			System.out.print((char)(ch-32));
			}
			else
			{
				System.out.print(ch);
			}
		    }
		System.out.println();
		}
	private void print5() {
		String name = "ganeshkumar";
		for(int i =0;i<name.length();i++)
		{
			char ch =name.charAt(i);
			if(i!=0)
			{
			if(ch>='a' && ch<='z') 
			System.out.print((char)(ch-32));
			}
			else
			{
				System.out.print(ch);
			}
		    }
		System.out.println();
		}
		
	}


