package shape;

public class EquiletralTriangle extends Triangle {
	double radius,area,perimeter;
	String name="Equiletral triangle";
	public EquiletralTriangle(double side1, double side2, double side3,double height) {
		super(side1, side2, side3,height);
		// TODO Auto-generated constructor stub
	}
	public void checkEquiletraltriangle() {
		if (side1 == side2 && side3 == side2) {
			System.out.println("According to Pythogorous theorem the given shape is a EQUILETRALTRIANGLE");
		}
		else {
			System.out.println("not a proper right angle triangle");
		}
	}
	public String getName() {
		System.out.println("The name of the shape is  "  + name);
		return name;
	}
	public double getArea(){
		checkEquiletraltriangle();
		area  =  (1.732 * side1 * side1 ) / 4;
		System.out.println("the area of Circle is  "+   area);
		return area;
	}
	public double getPerimeter() {
		checkEquiletraltriangle();
		perimeter = 3 * side1;
		System.out.println("The perimeter of a circle   " +   perimeter);
		return perimeter;

	}
	public String getColor() {
		checkEquiletraltriangle();
		System.out.println("Select any colour");
		color = scan.next();
		return color;
	}
	public void setColor() {
		checkEquiletraltriangle();
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


