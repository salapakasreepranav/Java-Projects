import java.util.Scanner;

//abstract class
abstract class Figure 
{	
	double area, perimeter;
	
	//abstract methods
	abstract public double perimeter();
	public abstract double area();
	abstract void input();
	
	//concrete method
	void display()
	{
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}
	
	//An abstract class can have both abstract and concrete methods
}

//Child Class (Inheritance) 
class Square extends Figure
{
	double length;
	
	//Implementing abstract methods (method overriding)
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of square");
		length = sc.nextDouble();
	}
	public double perimeter() 
	{
		return (perimeter = 4*length);
	}
	public double area()
	{
		return (area = length*length);
	}
}

//Child Class (Inheritance) 
class Rectangle extends Figure
{
	double length;
	double width;
	
	//Implementing abstract methods (method overriding)
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		length = sc.nextDouble();
		System.out.println("Enter the width of Rectangle");
		width = sc.nextDouble();
	}
	public double perimeter() 
	{
		return (perimeter = 2*(length + width));
	}
	public double area()
	{
		return (area = length*width);
	}
}

//Child Class (Inheritance) 
class Circle extends Figure
{
	double radius;
	final double pi = 22.0/7.0;
	
	//Implementing abstract methods (method overriding)
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		radius = sc.nextDouble();
	}
	public double perimeter() 
	{
		perimeter = 2*pi*radius;
		return perimeter;
	}
	public double area()
	{
		return area = pi*radius*radius;
	}
	
	//Overridden concrete method
	void display()
	{
		System.out.println("Circumference: " + perimeter);
		System.out.println("Area: " + area);
	}
}

class Calculator
{
	//Runtime Polymorphism (Loose Coupling)
	void calculate(Figure fig)
	{
		fig.input();
		fig.perimeter();
		fig.area();
		fig.display();
	}
}

public class LaunchApp {

	//static block
	static
	{
		System.out.println("Welcome to Geometry Application");
		System.out.println("Here you can find Perimeter and Area of Square, Rectangle and Circle");
	}
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//labeling the loop
		loop: while(true) 
		{
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("Choose Figure");
			System.out.println("1. Square \n2. Rectangle \n3. Circle \n4. Exit");
			int input = sc.nextInt();
			
			Calculator calc = new Calculator();
		
			switch(input) {
			
				case 1: 
					calc.calculate(new Square());
					break;
				case 2:
					calc.calculate(new Rectangle());
					break;
				case 3:
					calc.calculate(new Circle());
					break;
				case 4:
					break loop;
				default:
					System.out.println("Choose proper option");
					
			}
			
		}
		
		
	}

}
