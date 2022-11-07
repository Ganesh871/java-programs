public class Looping1 {
public static void main(String[] args) {
	Looping1 loop = new Looping1();
	loop.print1();
	System.out.println();
	loop.print2();
	System.out.println();
	loop.print3();
	System.out.println();
	loop.print4();
}

 void print1()
{
int count=0;
while(count<=5)
{
	System.out.print(1+" ");
	count=count+1;
}
}
void print2() {
int no=1;
while(no<=5)
{
	System.out.print(no+" ");
	no=no+1;
}
}
void print3() {
	int no=1;
	while(no<=9)
	{
		System.out.print(no+" ");
		no=no+2;
	}
	
}
void print4() {
	int no=0;
	while(no<=15)
	{
		System.out.print(no+" ");
		no=no+3;
	}
			
	
}


}
