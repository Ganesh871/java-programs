package array;

public class Arraydemo {
	public static void main(String[] args)
	{
		int[]age = {12,2,7,9,5};
		System.out.println("index length "+age.length);
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		System.out.println("using for loop");
		for(int i = 0; i<age.length; i++)
			System.out.println(age[i]);
	}

}
