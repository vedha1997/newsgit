package shape;

import java.util.Scanner;

public abstract class Triangle implements Shapes{
	Scanner scan = new Scanner(System.in);
	double side1,side2,side3,height,area,perimeter;
	String name = "TRIANGLE";
	String color;
	public Triangle(double side1,double side2,double side3,double height) {
		this.side1=side1;
		this.side2=side2;
		this.side2=side3;
		this.height=height;
	}
	public String getName() {
		System.out.println("The name of the shape is  "  + name);
		return name;
	}
	public double getArea(){
		area  =  (side1*height)/2;
		System.out.println("the area of triangle is  "+   area);
		return area;
	}
	public double getPerimeter() {
		perimeter = side1+side2+side3;
		System.out.println("The perimeter of a circle   " +   perimeter);
		return perimeter;

	}
	public String getColor() {
		
		System.out.println("Select any colour");
		color = scan.next();
		return color;
	}
	public void setColor() {
		System.out.println("the colour you have selected is   "  + color );
		if(color  ==  "blue") {
			System.out.println("BLUE");
		}
		else if(color=="red") {
			System.out.println("RED");
		}
		else if(color  ==  "grey") {
			System.out.println("GREY");
		}
		else
		{
			System.out.println("Colour mismatch");
		}
		

	}


}


