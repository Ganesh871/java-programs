class Student
{
int id,age;
String name;
Student(int id,String name)
{
this.id= id;
this.name= name;
}
Student(int id,String name,int age)
{
this.id=id;
this.name=name;
this.age=age;
}
Student()
{

}
void display()
{
System.out.println(id+"" +name+""+age);
}
public static void main(String[] args)
{
Student s1=new Student(111,"ganesh");
Student s2=new Student(222,"kumar", 25);
Student s3=new Student();
s1.display();
s2.display();
s3.display();
}
}
