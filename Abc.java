package functionalinterface;

public class Abc {
public static void main(String[] args)
{
Functional_Interface_demo fid =(i ,j)->
	{
	//System.out.println(i+j);
	return i+j;
	};
	int result=fid.f1(10,4);
	System.out.println(result);
	fid.f3();
	Functional_Interface_demo.f2();
	
}
}
