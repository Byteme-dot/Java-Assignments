class Varargs_avg {
    static void PrintAvg(double... numbers) {
        double total = 0.0;
        int count = 0;

        for (double num : numbers) {
            total += num;
            count++;
        }
        double avg = total / count;
        System.out.println("Avg = " + avg);
    }

    public static void main(String[] args){
        PrintAvg(5.2, 4.3, 6.0, 7.1, 10.9);
    }
}