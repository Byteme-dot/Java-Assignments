import java.util.*;

public class ArrayRemoveDup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int[] newarr = new int[5];
		int a;
		for(int i=0;i<5;i++){
			System.out.print("Enter Element "+(i+1)+" :");
			a=scan.nextInt();
			arr[i]=a;
		}
        System.out.println("--Your Array--");
        System.out.print("[");
		for(int j=0;j<5;j++){
            System.out.print(" "+arr[j]+" ");
		}      
        System.out.println("]");   
        int newIndex = 0;
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == newarr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                newarr[newIndex] = arr[i];
                newIndex++;
            }
        }
        System.out.println("--Your New Array--");
        System.out.print("[");
		for(int j=0;j<5;j++){
            System.out.print(" "+newarr[j]+" ");
		}             
        System.out.print("]");

    }
}
