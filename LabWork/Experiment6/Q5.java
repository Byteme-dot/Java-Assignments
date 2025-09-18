abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int m1, m2, m3;

    A(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    double getPercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}

class B extends Marks {
    int m1, m2, m3, m4;

    B(int m1, int m2, int m3, int m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}

public class Q5 {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 80);
        B studentB = new B(75, 88, 92, 85);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}