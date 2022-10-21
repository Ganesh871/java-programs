class SmartPhone2 extends Phone    //hierarchical inheritance
{
int price=45000;
String name= "oppo";
public void ram()
{
System.out.println("4gb ram");
}
public static void main(String[] arg)
{
SmartPhone2 oppo=new SmartPhone2();
System.out.println(oppo.name);
System.out.println("Rs "+oppo.price+"/-");
oppo.call();
oppo.received_call();
oppo.sms();
oppo.ram();
}
}
