abstract class Shape {
    String shapeName;

    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {

    void RectangleArea(double length, double breadth) {
        shapeName = "Rectangle";
        double area = length * breadth;
        System.out.println(shapeName + " Area: " + area);
    }

    void SquareArea(double side) {
        shapeName = "Square";
        double area = side * side;
        System.out.println(shapeName + " Area: " + area);
    }

    void CircleArea(double radius) {
        shapeName = "Circle";
        double area = Math.PI * radius * radius;
        System.out.println(shapeName + " Area: " + area);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Area a = new Area();
        a.RectangleArea(10, 5);
        a.SquareArea(6);
        a.CircleArea(7);
    }
}