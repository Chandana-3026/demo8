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
class Test6
{
public static void main(String args[])
{
Student[] ob=new Student[4];
ob[0].setId(1111);
ob[0].setName("Aryan");
System.out.println("ID:"+ob[0].getId());
System.out.println("NAME:"+[0].getName());

ob[1].setId(2222);
ob[1].setName("Karan");
System.out.println("ID:"+ob[1].getId());
System.out.println("NAME:"+ob[1].getName());

ob[2].setId(1333);
ob[2].setName("Nandini");
System.out.println("ID:"+ob[2].getId());
System.out.println("NAME:"+ob[2].getName());

ob[3].setId(4444);
ob[3].setName("Mahi");
System.out.println("ID:"+ob[3].getId());
System.out.println("NAME:"+ob[3].getName());

ob[4].setId(5555);
ob[4].setName("Meena");
System.out.println("ID:"+ob[4].getId());
System.out.println("NAME:"+ob[4].getName());
}
}
