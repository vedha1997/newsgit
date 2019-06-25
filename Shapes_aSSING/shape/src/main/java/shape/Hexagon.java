package shape;

import java.util.Scanner;

public class Hexagon implements Shapes {
	Scanner scan = new Scanner(System.in);
	String name = "Hexagon";
	String color;
	double area,side,perimeter;
	 double apothem;
	public Hexagon(double perimter,double apothem) {
		this.perimeter = perimeter;
		this.apothem = apothem;
	}

	public String getName() {
		System.out.println("The name of the shape is  " + name);
		// TODO Auto-generated method stub
		return name;
	}

	public double getArea() {
		System.out.println("For finding area of a hexagon we have to find the perimter firstly");
		perimeter = 6 * side;
		System.out.println("the perimeter is  "  +  perimeter);
		area = (perimeter * side)/2;
		System.out.println("The area is   "  +   area);
		// TODO Auto-generated method stub
		return area;
	}

	public double getPerimeter() {
		perimeter = 6 * side;
		System.out.println("the perimeter is  "  +  perimeter);
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
		
	}		// TODO Auto-generated method stub
		
	
	public String getColor() {
		System.out.println("Select any colour");
		color=scan.next();
		return color;

}}
