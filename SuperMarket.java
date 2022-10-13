class SuperMarket
{
int price,discount;
String brand;
static String name="raja super market";
SuperMarket(String brand, int price ,int discount)
{
this.brand=brand;  
this.price=price;
this.discount=discount;
}
public static void main(String[]args)
{
SuperMarket brush= new SuperMarket("pepsodent",30,5);
SuperMarket soap= new SuperMarket ("lux",35,3);
brush.purchase();
soap.purchase();
}
void purchase()
{
System.out.println("customer is buying " +  brand + " for RS" +  price + " with discount " +  discount);

}

}
