package regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexdemo {

	public static void main(String[] args)
	{
		Regexdemo rd = new Regexdemo();
		rd.regex1();
		System.out.println();
		rd.regex2();
		System.out.println();
		System.out.println("show only d");
		rd.regex3();
		System.out.println();
		rd.regex4();
		System.out.println();
		System.out.println("show only mobile number");
		rd.regex5();
	}
	private void regex1() {
		String input ="abcd abc abc ab bc abc";
		Pattern patternobj = Pattern.compile("ab");
		Matcher matcherobj = patternobj.matcher(input);
		//System.out.println(matcherobj.find());
		//System.out.println(matcherobj.group());
		while(matcherobj.find())
		{
			System.out.print(matcherobj.group());
		}
		System.out.println();
		
	}
	private void regex2() {
		String input ="abcd abc abc ab bc abc";
		Pattern patternobj = Pattern.compile("[a bc]");
		Matcher matcherobj = patternobj.matcher(input);
		while(matcherobj.find())
		{
			System.out.print(matcherobj.group());
		}
		System.out.println();
	}
	private void regex3() {
		String input ="abcd abcd abc abd bcd abc";
		Pattern patternobj = Pattern.compile("[^abc]");
		Matcher matcherobj = patternobj.matcher(input);
		while(matcherobj.find())
		{
			System.out.print(matcherobj.group());
		}
		System.out.println();
	}
	private void regex4() {
		String input ="Ganeshkumarv1998@gmail.com";
		//Pattern patternobj = Pattern.compile("[a-z]");
		//Pattern patternobj = Pattern.compile("[a-z0-9]");
		Pattern patternobj = Pattern.compile("[^a-z0-9]");
		Matcher matcherobj = patternobj.matcher(input);
		while(matcherobj.find())
		{
			System.out.print(matcherobj.group());
		}
		System.out.println();
	}
	private void regex5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anything ");
		String input =sc.nextLine();
		//Pattern patternobj = Pattern.compile("[0-9]{10}");
		//Pattern patternobj = Pattern.compile("[6-9][0-9]{9}");
		Pattern patternobj = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher matcherobj = patternobj.matcher(input);
		while(matcherobj.find())
		{
			System.out.print(matcherobj.group());
		}
		System.out.println();
		
	}
}
