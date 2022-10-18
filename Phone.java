class Phone
{
int price=1500;
String name = "phone";
void call()
{
System.out.println("calling facility");
}
void received_call()
{
System.out.println("received call facility");
}
void sms()
{
System.out.println("sms facility");
}
public static void main(String[] args)
{
Phone bsnl=new Phone();
System.out.println(bsnl.name);
System.out.println("RS "+bsnl.price+"/-");
bsnl.call();
bsnl.received_call();
bsnl.sms();
}
}

