class MuniyandiVilas
{
int price;
String brand;
static String name="Muniyandi vilas";
MuniyandiVilas(String brand, int price )
{
this.brand=brand;  
this.price=price;
}
public static void main(String[]args)
{
MuniyandiVilas biriyani= new MuniyandiVilas("chicken biriyani",120);
MuniyandiVilas vegmeals= new MuniyandiVilas("veg meals",80);
System.out.println(MuniyandiVilas.name);
biriyani.eating();
vegmeals.eating();
}
void eating()
{
System.out.println("customer is buying " +  brand + " for RS" +  price );

}

}
