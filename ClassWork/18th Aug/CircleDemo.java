import java.util.*;

class Circle{
	double radius = 0.0;
	double area = 0.0;
	void findArea(double r){
		area = (3.14 *(r*r));
	}
	void displayArea(){
		System.out.println("Area of the circle = "+area);
	}
}

class CircleDemo{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		Circle c = new Circle();
		System.out.print("Enter radius of circle: ");
		c.radius = scan.nextDouble();
		c.findArea(c.radius);
		c.displayArea();
	}	
}