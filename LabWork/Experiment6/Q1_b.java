interface A{
    void methodA();
}

interface B extends A{
    void methodB();
}

class Testing implements B{

    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB(){
        System.out.println("Method B");
    }
    
}

public class Q1_b {
    public static void main(String[] args){
        Testing test = new Testing();
        test.methodA();
        test.methodB();
    }
}   
