class Square implements Area
{
public void area()
{
int length=5;
int area=length*length;
System.out.println("the area of the square is "+(length*length));
}
public static void main(String[] args)
{
Square s=new Square();
s.getsides();
s.area();
}
}
