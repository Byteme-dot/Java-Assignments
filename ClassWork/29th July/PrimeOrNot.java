import java.util.*;
class PrimeOrNot{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();
        int check=0;
        for(int i=2;i<(num/2);i++){
            if(num%i==0){
                check++;
            }
        }
        if(check>0){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }
    }
}