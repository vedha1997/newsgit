package shape;

import java.util.Scanner;

public abstract class Circle implements Shapes {
	Scanner scan = new Scanner(System.in);
	String color;
	//String color1;
	//String color2;
	//String color3;
	double radius,area,perimeter;
	String name="CIRCLE";
	public Circle   (double radius) {
		this.radius = radius;

	}
	public String getName() {
		System.out.println("The name of the shape is  "  + name);
		return null;
	}
	public double getArea(){
		area  =  3.14*radius*radius;
		System.out.println("the area of Circle is  "+   area);
		return area;
	}
	public double getPerimeter() {
		perimeter = 2*3.14*radius;
		System.out.println("The perimeter of a circle   " +   perimeter);
		return perimeter;

	}
	public String getColor() {
		
		System.out.println("Select any colour");
		color=scan.next();
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
