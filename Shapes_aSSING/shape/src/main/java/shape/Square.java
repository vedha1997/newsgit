package shape;

import java.util.Scanner;

public class Square implements Shapes {
	Scanner scan = new Scanner(System.in);
	String color;
	String name = "Square";
	double area,side,perimeter;
	public Square(double side) {
		this.side = side;

	}

	public String getName() {
		System.out.println("The name of the shape is  " +  name);
		// TODO Auto-generated method stub
		return name;
	}

	public double getArea() {
		area = side * side;
		System.out.println("the area is   "  +   area);

		// TODO Auto-generated method stub
		return area;
	}

	public double getPerimeter() {
		perimeter = 4 * side;
		System.out.println("the perimeter is   " + perimeter);
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


	}

	// TODO Auto-generated method stub



	public String getColor() {
		System.out.println("Select any colour");
		color=scan.next();
		return color;
		// TODO Auto-generated method stub

	}

}
