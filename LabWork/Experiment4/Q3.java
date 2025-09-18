import java.util.Scanner;
class Area{
    double length;
    double breadth;
    double area;

    Area(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
        this.area = length*breadth;
    }


    double returnArea(){
        return area;
    }
}

public class Q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double len = scan.nextDouble();
        System.out.print("Enter Breadth: ");
        double brdth = scan.nextDouble();
        Area a = new Area(len,brdth);
        Double area = a.returnArea();    
        System.out.println("Area of rectangle: "+area);
    }
}
