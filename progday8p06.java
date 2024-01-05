//To revise easily about setter,getter,public,private
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
class Test5
{
public static void main(String args[])
{
Student ob=new Student();
ob.setId(1111);
ob.setName("Aryan");
System.out.println("ID:"+ob.getId());
System.out.println("NAME:"+ob.getName());
}
}
