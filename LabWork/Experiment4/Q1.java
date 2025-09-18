class Student{
    int rollno;
    String name;

    void SetVal(int r,String n){
        rollno=r;
        name=n;
    }
    void printVal(){
        System.out.println("Roll no: "+rollno);
        System.out.println("Name: "+name);
    }
}

public class Q1 {
    public static void main(String[] args){
        int roll= 2;
        String name= "John";
        Student std = new Student();
        std.SetVal(roll,name);
        std.printVal();
    }
}
