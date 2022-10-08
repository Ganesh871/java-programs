class Calculator2
{
public static void main(String []args)
{
Calculator2 calc = new
Calculator2();
calc.add(100,200);
calc.add(10,20);
calc.add(10,20,30);
calc.add(5.5f,4.5f);
}
void add(int no1,int no2)
{
System.out.println(no1+no2);
}
void add(int no1,int no2,int  no3)
{
System.out.println(no1+no2+no3);
}
void add(float no1,float no2)
{
System.out.println(no1+no2);
}
}
