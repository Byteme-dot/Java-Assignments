class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public void displayDetails(){
		System.out.println("Name: "+name+" ID: "+id);
	}
}

class Manager extends Employee{
	String department;
	public Manager(String name,int id, String department){
		super(name,id);
		this.department = department;
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Department: "+department);
	}
}

public class Main{
	public static void main(String[] args){
		Manager mgr = new Manager("Abhishek",24005,"CSE");
		mgr.displayDetails();
	}
}	