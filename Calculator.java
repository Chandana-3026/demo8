//Java program to get the cube of a given number using the static method
import java.util.Scanner;
class Calculator
{
static int cube(int x)
{
return x*x*x;
}
public static void main(String args[])
{
int result=Calculator.cube(6);
System.out.println(result);
}
}
//1.this and super cannot be used in static context
//2.a static member cannot access non-static member