import java.io.*;
class Method_overloading
{
int len,bre;
void area(int len,int bre)
{
System.out.println("The area of room is"+len*bre);
}
void area1(int len)
{
bre=20;
System.out.println("The area of room is"+len*bre);
}
void area2()
{
len=10;
bre=20;
System.out.println("The area of room is"+len*bre);
}
}
class Week5_1
{
 public static void main(String[] args)
 {
  Method_overloading obj=new Method_overloading();
  obj.area(10,20);
  obj.area1(10);
  obj.area2();
 }
}