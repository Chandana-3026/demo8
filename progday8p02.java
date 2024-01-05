//Java static method
//only static method can access the static variables and can make changes
class Student1
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTIET";
}
Student1(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
//Test cass to create and display the values of object
class TestStaticMethod
{      
public static void main(String args[])
{
//creating objects
Student1 s1=new Student1(111,"Sumit");
Student1 s2=new Student1(222,"Aryan");
s1.display();
s2.display();
Student1.change();//calling change method
Student1 s3=new Student1(333,"Rani");
//calling change method
s1.display();
s2.display();
s3.display();
}
}