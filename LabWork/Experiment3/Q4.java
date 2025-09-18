import java.util.*;
public class Q4 {
    public static void ArrSum(int[] arr){
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements = "+sum);
    }

    public static void AltArrSum(int[] arr){
        int altsum=0;
        for(int i=0;i<5;){
            altsum = altsum+arr[i];
            i+=2;
        }
        System.out.println("Sum of alternate elements = "+altsum);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
		int a;
		for(int i=0;i<5;i++){
			System.out.print("Enter Element "+(i+1)+" :");
			a=scan.nextInt();
			arr[i]=a;
		}     
        System.out.println("--Your Array--");
		for(int j=0;j<5;j++){
			System.out.println("Element "+(j+1)+" : "+arr[j]);
		}
        ArrSum(arr);        
        AltArrSum(arr);        
    }
}
