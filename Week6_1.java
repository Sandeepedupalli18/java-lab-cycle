import java.util.*;
abstract class Shape
 {
     int length, breadth, radius;
     Scanner input = new Scanner(System.in);
     abstract void printArea();
 }
class Rectangle extends Shape 
 {
	void printArea()
        {
                System.out.println("To find the area of rectangle");
		System.out.print("Enter length :"); 
		length=input.nextInt();
                System.out.print("Enter breadth:");
		breadth=input.nextInt();
		System.out.println("The area of Rectangle is:"+length*breadth);
	}
 }
class Triangle extends Shape 
{
	void printArea() 
        {
                System.out.println("To find the area of triangle");
		System.out.print("Enter Base: ");
		length=input.nextInt();
                System.out.print("Enter Height: ");
		breadth=input.nextInt();
		System.out.println("The area of Triangle is:"+(length*breadth)/2);
	}
}
class Circle extends Shape 
{
	void printArea()
        {
                System.out.println("To find the area of circle");
		System.out.print("Enter Radius: ");
		radius = input.nextInt();
		System.out.println("The area of Circle is:"+3.14*radius*radius);
	}
}
public class Week6_1
{
	public static void main(String[] args)
        {
		Rectangle r=new Rectangle();
		r.printArea();
		Triangle t=new Triangle();
		t.printArea();
		Circle c=new Circle();
		c.printArea();
	}
}