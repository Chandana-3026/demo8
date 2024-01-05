//Java program to illustrate with the use of static variable which is shared with all objects
class Counter
{
static int count=0;//will get memory only once and retain its value//without static;int count=0; output is 1 1 1
Counter()
{
count++;//Incementing
System.out.println(count);
}
public static void main(String args[])
{
//creating  objects
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}
//output is 1 2 3 when static is used
