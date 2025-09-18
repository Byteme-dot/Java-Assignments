class Triangle{
    int side1;
    int side2;
    int side3;
    int perimeter=0;
    double area=0;
    void setVal(int a, int b, int c){
        side1=a;
        side2=b;
        side3=c;
    }

    void printAreaPeri(){
        perimeter = side1 + side2 + side3;
        double s=perimeter/2.0;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area = "+area+"\nPerimeter ="+perimeter);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setVal(3, 4, 5);
        t.printAreaPeri();
    }
}
