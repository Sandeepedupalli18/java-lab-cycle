import java.io.*;
import java.util.*;
public class Week2_1
{
public static void main(String args[])
{
Area a=new Area();
a.read();
a.area();
a.display();
}
}
class Area
{
static int l,b,area;
static void read()
{
System.out.println("enter dimensions of a rectangle");
Scanner s=new Scanner(System.in);
l=s.nextInt();
b=s.nextInt();
}
static void area()
{
area=l*b;
}
static void display()
{
System.out.println("Area of the Rectangle is:"+area);
}
}
