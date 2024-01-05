//Java static nested class
//Instance method
class TestOuter
{
static int data=300;
static class Inner
{
void msg()
{
System.out.println("data is"+data);
}
}
public static void main(String args[])
{
TestOuter.Inner obj=new TestOuter.Inner();
obj.msg();
}
}
