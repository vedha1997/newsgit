package shape;
import java.lang.Math; 

public class RightAngleTriangle extends Triangle{
	double side1;
	double side2;
	double side3;
	double height;

	public RightAngleTriangle(double side1, double side2, double side3,double height) {
		super(side1, side2, side3,height);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	String name =  "RIGHT ANGLE TRIANGLE";
	public void checkRightAngletriangle() {
		if ((side1)*(side1) ==((side2)*(side2) + (side3)*(side3))) {
			System.out.println("According to Pythogorous theorem the given shape is a RIGHTANGLETRIANGLE");
		}
		else {
			System.out.println("not a proper right angle triangle");
		}
	}
	public String getName() {
		System.out.println("The name of the shape is  "  + name);
		return null;
	}
	public double getArea(){
		checkRightAngletriangle();
		area  =  (side2*side3)/2;
		System.out.println("the area of rightangletriangle is  "+   area);
		return area;
	}
	public double getPerimeter() {
		checkRightAngletriangle();
		perimeter = side1+side2+side3;
		System.out.println("The perimeter of a circle   " +   perimeter);
		return perimeter;

	}
	public String getColor() {
		checkRightAngletriangle();
		System.out.println("Select any colour");
		color = scan.next();
		return color;
	}
	public void setColor() {
		checkRightAngletriangle();
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





