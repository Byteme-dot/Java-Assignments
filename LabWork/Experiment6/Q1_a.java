interface A{
    void methodA();
}

interface B{
    void methodB();
}

class Parents{
    void parentMethod(){
        System.out.println("Parent Method");
    }
}

class Child extends Parents implements A,B{
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodB(){
        System.out.println("Method B");
    }
}

public class Q1_a {
    public static void main(String[] args){
        Child obj = new Child();
        obj.parentMethod();
        obj.methodA();
        obj.methodB();
    }
}
