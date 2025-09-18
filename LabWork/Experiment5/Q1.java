class Shape{
    void print(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
    @Override
    void print(){
        System.out.println("This is rectangle shape");
    }

    void callShapePrint(){
        super.print();
    }
}

class Circle extends Shape{
    @Override
    void print(){
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle{
    @Override
    void print(){
        System.out.println("Square is Rectangle");
    }

    void callRectanglePrint(){
        super.print();
    }

    void callShapePrint(){
        super.callShapePrint();
    }
}

public class Q1 {
    public static void main(String[] args){
        Square sq = new Square();
        sq.print();
        sq.callRectanglePrint();
        sq.callShapePrint();
    }
}
