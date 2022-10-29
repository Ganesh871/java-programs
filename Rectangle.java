class Rectangle implements Area
{
public void getsides()
{
System.out.println("rectangle have 4 sides");
}
public void area()
{
int length=5;
int breath=7;
int area=length*breath;
System.out.println("the area of the rectangle is "+area);
}
public static void main(String[] args)
{
Rectangle r=new Rectangle();
r.getsides();
r.area();
}
}
