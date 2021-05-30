package Activity4_Abstract_Class_Activity;

import java.util.Scanner;

abstract class Shape{
	protected int value;
	Shape(int value){
		this.value = value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	abstract void calculateArea(int value);
}

class Circle extends Shape{
	Circle(int value){
		super(value);
	}
	
	void calculateArea(int value){
		double area = 3.14 * value * value;
		System.out.println("The area of the Circle is: "+area);
	}
}

class Square extends Shape{
	Square(int value){
		super(value);
	}
	
	void calculateArea(int value){
		double area = value * value;
		System.out.println("The area of the square is: "+area);
	}
}

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Circle \nSquare");
		System.out.println("Enter the shape: ");
		String choice;
		choice = scan.next();
		switch(choice){
		case "Circle":
			System.out.println("Enter the radius of the circle: ");
			int radius = scan.nextInt();
			Circle cir = new Circle(radius);
			cir.calculateArea(radius);
			break;
		case "Square":
			System.out.println("Enter the length of the side of the squeare: ");
			int side = scan.nextInt();
			Square sq = new Square(side);
			sq.calculateArea(side);
			break;
		default:
			break;
		}
	}

}
