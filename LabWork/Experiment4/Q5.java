import java.util.Scanner;

class Point {
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    static double calculateDistance(Point p1, Point p2){
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        double distance = Point.calculateDistance(p1, p2);
        System.out.println("Distance between points: " + distance);
        sc.close();
    }
}