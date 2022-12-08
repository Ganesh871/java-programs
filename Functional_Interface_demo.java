package functionalinterface;
@FunctionalInterface
public interface Functional_Interface_demo 
{
public abstract int f1(int no1 ,int no2);
static void f2()
{
	System.out.println("hi");
}
default void f3()
{
	System.out.println("hello");
}
}
