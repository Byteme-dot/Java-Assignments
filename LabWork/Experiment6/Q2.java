interface GeometricObject{
    double getPerimeter();
    double getArea();
}

interface Resizable{
    void resize(int percent);
}

class Circle implements GeometricObject{
    double radius = 1.0;

    Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

}

class ResizableCircle extends Circle implements Resizable{
    public void resize(int percent){
        radius = radius * percent/100.0;
    }

    public ResizableCircle(double radius){
        super(radius);
    }


}

public class Q2 {
    public static void main(String[] args){
        ResizableCircle rc = new ResizableCircle(10);
        System.out.println("Original Radius: " + rc.radius);
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());

        rc.resize(50);  // Resize to 50%
        System.out.println("\nAfter Resize:");
        System.out.println("New Radius: " + rc.radius);
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    } 
}
