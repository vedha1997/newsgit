package shape;

public class SemiCircle extends Circle{
	String name="Circle";

	public SemiCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		System.out.println("The name of the Shape is   "  +  name);
		return name;
	}
	public double getArea() {
		area = (3.14*radius*radius)/2;
		System.out.println("the area of SemiCircle is  "+   area);
		return area;
	}
	public double getPerimeter() {
		perimeter = (3.14*radius)+(2*radius);
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
