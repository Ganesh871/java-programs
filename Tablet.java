class Tablet extends Smartphone  //multilevel inheritance
{
int price=45000;
String name= "oppo pad";
public void ram()
{
System.out.println("4gb ram");
}
public static void main(String[] arg)
{
Tablet oppo=new Tablet();
System.out.println(oppo.name);
System.out.println("Rs "+oppo.price+"/-");
oppo.call();
oppo.received_call();
oppo.sms();
oppo.videocall();
oppo.ram();
}
}
