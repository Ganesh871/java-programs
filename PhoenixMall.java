class PhoenixMall
{
static String address="vivekanandar street ,dubai";
static int openingTime=9;
String movieName;
int movieTime;
boolean movieHit;
public static void main(String[]args)
{
PhoenixMall screen1=new PhoenixMall();
screen1.movieName= "ponniyin selvan";
screen1.movieTime=10;
screen1.movieHit=true;
PhoenixMall screen2=new PhoenixMall();
screen2.movieName= "Nane varuven";
screen2.movieTime=11;
screen2.movieHit=false;
PhoenixMall screen3=new PhoenixMall();

System.out.println("address"+PhoenixMall.address);
System.out.println("Movie name"+ screen1.movieName);
System.out.println("movie time"+screen1.movieTime);
System.out.println(screen1.movieHit);

System.out.println("movie name"+screen2.movieName);
System.out.println("movie time"+screen2.movieTime);
System.out.println(screen2.movieHit);

System.out.println("movie name"+screen3.movieName);
System.out.println("movie time"+screen3.movieTime);
System.out.println(screen3.movieHit);
}
}
