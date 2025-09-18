import java.util.Scanner;
class Vehicle{
    void display(){
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle{
    @Override
    void display(){
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle{
    @Override
    void display(){
        System.out.println("This is a Bike");
    }
}

public class Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of tyres: ");
        int tyres = scan.nextInt();
        if(tyres==2){
            Bike bike = new Bike();
            System.out.print("\nBike object created");
            bike.display();
        }else if(tyres==4){
            Car car = new Car();
            System.out.print("\nCar object created");
            car.display();
        }else{
            Vehicle veh = new Vehicle();
            System.out.print("\nVehicle object created");
            veh.display();
        }
    }
}
