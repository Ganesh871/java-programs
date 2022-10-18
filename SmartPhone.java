
class SmartPhone extends Phone
{
int price=25000;
String name= " Samsung Mobile";
public void videocall()
{
System.out.println("videocall facility");
}
public static void main(String[] arg)
{
SmartPhone samsung=new SmartPhone();
System.out.println(samsung.name);
System.out.println("Rs "+samsung.price+"/-");
samsung.call();
samsung.received_call();
samsung.sms();
samsung.videocall();
}
}

