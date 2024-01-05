// Java program to demonstrate the use of ststic variables
class Student
{
int rollno;
String name;
static String college="MTIET";
Student(int i,String n)
{
rollno=i;
name=n;
}
void display()
{
System.out.println(rollno+"  "+name+" "+college);
}
}
class TestStaticVariable
{
public static void main(String args[])
{
Student s1=new Student(111,"Aryan");
Student s2=new Student(222,"Sumit");
//we can change the college of all objects by the single line of the codess
Student.college="MTIE";
s1.display();
s2.display();
}
}
