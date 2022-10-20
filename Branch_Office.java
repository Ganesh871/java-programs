package tamilnadu.erode;
import tamilnadu.chennai.Office2;
public class Branch_Office extends Office2
{
public int salary=20000;
public Branch_Office()
{
System.out.println("branch office constructor");
}
public static void main(String[]args)
{
Branch_Office manager = new Branch_Office();
manager.work();
System.out.println(manager.salary);
}
public void work()
{
System.out.println("working 10-10PM");
}
}

