class Home
{
public static void main(String[] args)
{
Home home=new Home();
int amount=home.read_eb();
}
int read_eb()
{
float units=150;
int amount=(int)units*2;
System.out.println("reading amount"+amount);
return amount;
}
}
























