import java.util.*;

class Box{
	double width;
	double height;
	double depth;
	double vol;
	void setDim(double a,double b,double c){
		width = a;
		height = b;
		depth = c;
	}
	void volume(){
		vol = (width * height * depth);
		System.out.println("Volume = "+vol);
	}
}

class BoxDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.print("Enter Width: ");
		a = scan.nextDouble();
		System.out.print("Enter height: ");
		b = scan.nextDouble();
		System.out.print("Enter depth: ");
		c = scan.nextDouble();
		Box Bx = new Box();
		Bx.setDim(a,b,c);
		Bx.volume();
	}
}
		