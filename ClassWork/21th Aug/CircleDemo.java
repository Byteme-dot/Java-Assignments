import java.util.Scanner;

class Circle{
	private
		Double radius = 0.0;
		Double area = 0.0;
	public
		void setRadius(double a){
			radius = a;
		}
		
		void getRadius(){
			System.out.println("Radius = "+radius);
		}
		
		void findArea(){
			area = 3.14 * (radius * radius);
		}
		
		void displayArea(){
			System.out.println("Area = "+area);
		}
	}
	
public class CircleDemo{
	public static void main(String[] args){
		Circle c = new Circle();
		c.setRadius(54.2);
		c.getRadius();
		c.findArea();
		c.displayArea();
	}
}