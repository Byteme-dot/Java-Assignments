class Vehicle{
	private String brand;
	public Vehicle(String brand){
		this.brand = brand;
	}
	
	public void displayDetails(){
		System.out.println("Brand: "+brand);
	}
}

class Car{
	private String model;
	public Car(String brand,String model){
		super(brand);
		this.model = model;
	}
	
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Model: "+model);
	}
}

public class Main{
	public static void main(String[] args){
		Car c = new Car("BMW","M4 CS");
		c.displayDetails();
	}
}		