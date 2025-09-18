interface A{
    void methodA();
}

interface B{
    void methodB();
}

interface C extends A,B{
    void methodC();
}

class Testing implements C{

    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB(){
        System.out.println("Method B");
    }
    
    public void methodC(){
        System.out.println("Method C");

    }
    
}

public class Q1_c {
    public static void main(String[] args){
        Testing test = new Testing();
        test.methodA();
        test.methodB();
        test.methodC();
    }
}   
