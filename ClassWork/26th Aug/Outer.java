import java.util.*;

class Outer{
	String x = "Hello Java";
	class Inner{
		void Display(){
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.Display();
	}
}