//Static block Used to initialize the static data member
//It is executed before the main method at the time of classloading
class A
{
static 
{
System.out.println("Static block is invoked");
}
public static void main(String args[])
{
System.out.println("Hello main");
}
}