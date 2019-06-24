package shape;

import java.util.Scanner;

public class Pentagon implements Shapes {
	Scanner scan = new Scanner(System.in);
	String name = "Pentagon";
	String color;
	double area,apothem,perimeter,side;
	public Pentagon(double perimeter,double apothem,double side) {
		this.perimeter = perimeter;
		this.apothem = apothem;
		this.side = side;
		//this.height = height;
			}

	public String getName() {
		System.out.println("The name of the shape is    "  +   name);
		// TODO Auto-generated method stub
		return name;
	}

	public double getArea() {
		System.out.println("For finding area of a pentagon we have to find the perimter firstly");
		perimeter = 5 * side;
		System.out.println("The perimeter is   "  +   perimeter);
		area = (perimeter * apothem)/2 ;
		System.out.println("The area is   "  +   area);
		// TODO Auto-generated method stub
		return area;
	}

	public double getPerimeter() {
		perimeter = 5 * side;
		System.out.println("The perimeter is   "  +   perimeter);
		// TODO Auto-generated method stub
		return perimeter;
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
		// TODO Auto-generated method stub
		
	}

	public String getColor() {
		System.out.println("Select any colour");
		color=scan.next();
		return color;
		// TODO Auto-generated method stub
	}

}
