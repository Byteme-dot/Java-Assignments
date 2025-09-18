class Box{
	private
		double width = 0.0;
		double height = 0.0;
		double depth = 0.0;
		double volume = 0.0;
	public
		void setDim(double a, double b, double c){
			width = a;
			height = b;
			depth = c;
		}
		
		void findVolume(){
			volume = width * height * depth;
		}
		
		void displayVolume(){
			System.out.println("Volume = "+volume);
		}
}


public class BoxDemo{
	public static void main(String[] args){
		Box b = new Box();
		b.setDim(50,60,70);
		b.findVolume();
		b.displayVolume();
	}
}
