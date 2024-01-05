//To revise easily about setter,getter,public,private
//creating 5 objects with Scanner or user input 
import java.util.Scanner;
class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return this.id;//returning the id
}
public String getName()
{
return this.name;
}
}
class Test6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Student[] ob=new Student[3];
for(int i=0;i<3;i++)
{
ob[i]=new Student();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++)
{
System.out.println("ID:"+ob[j].getId());
System.out.println("NAME:"+ob[j].getName());
}
}
}