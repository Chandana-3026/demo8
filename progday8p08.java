//To revise easily about setter,getter,public,private
//creating 5 objects with the use of ARRAYS/ARRAY
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
class Test7
{
public static void main(String args[])
{
Student[] ob=new Student[5];
/*
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
Student s4=new Student();
Student s5=new Student();//we can also do in this way to get output
ob[0]=s1;
ob[1]=s2;
ob[2]=s3;
ob[3]=s3;
ob[4]=s3;
*/
ob[0]=new Student();//heap memory
ob[0].setId(1111);//stack memory
ob[0].setName("Aryan");
System.out.println("ID:"+ob[0].getId());
System.out.println("NAME:"+ob[0].getName());
ob[1]=new Student();
ob[1].setId(2367);
ob[1].setName("Karan");
System.out.println("ID:"+ob[1].getId());
System.out.println("NAME:"+ob[1].getName());
ob[2]=new Student();
ob[2].setId(1356);
ob[2].setName("Nandini");
System.out.println("ID:"+ob[2].getId());
System.out.println("NAME:"+ob[2].getName());
ob[3]=new Student();
ob[3].setId(4123);
ob[3].setName("Mahi");
System.out.println("ID:"+ob[3].getId());
System.out.println("NAME:"+ob[3].getName());
ob[4]=new Student();
ob[4].setId(5098);
ob[4].setName("Meena");
System.out.println("ID:"+ob[4].getId());
System.out.println("NAME:"+ob[4].getName());
}
}
