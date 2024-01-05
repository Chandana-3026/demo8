//Java static nested class ex with static method
//if u have the static member inside the static nested class,u don't need to create an instance of the static nested class
class TestOuter2
{
static int data=20;
static class Inner
{
static void msg()
{
System.out.println("data is"+data);
}
}
public static void main(String args[])
{
TestOuter2.Inner.msg();//no need to create the instance of static nested class
}
}
