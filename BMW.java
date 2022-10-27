class BMW extends Car
{
BMW()
{
System.out.println("BMW car");
}
public static void main(String[] args)
{
Car inspector=new BMW();
inspector.fixairbags();
inspector.accelerate();
inspector.applybreak();
}
void accelerate()
{
System.out.println("speed");
}
void applybreak()
{
System.out.println("stop");
}
void maintainquality()
{
System.out.println("super quality car");
}
}
