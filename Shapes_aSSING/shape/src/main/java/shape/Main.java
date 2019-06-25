package shape;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter your choice /n 1. Circle /n 2.TriangleRE /n 3.Triangle /n 4.Square /n 5.Hexagon /n 6.Pentagon");
		Scanner sc = new Scanner (System.in);
		Shapes shape = null;
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("1. Semicircle  2. Full circle");
		int choice1 = sc.nextInt();
		if(choice==1)
		{
			shape = new SemiCircle(4);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
		}


		break;
		case 2: System.out.println("1.Rightangletriangle 2.Equilateraltriangle");
		int choice2 = sc.nextInt();
		if (choice2==1)
		{
			shape = new RightAngleTriangle(2,3,4,5);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
		}
		else
			shape = new EquiletralTriangle(2,2,2,2);
		shape.getName();
		shape.getColor();
		shape.getArea();
		shape.getPerimeter();
		shape.setColor();

		break;

		case 3:
			shape = new Triangle(8,4,6,7);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
			break;
		case 4: 
			shape = new Square(6);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
			break;
		case 5: 
			shape = new Hexagon(8,9);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
			break;
		case 6:
			shape = new Pentagon(14,6,9);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
			break;
		}
	}

}
