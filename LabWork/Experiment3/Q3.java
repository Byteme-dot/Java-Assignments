import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int usize;
		System.out.print("Enter array size: ");
		usize=scan.nextInt();
		int arr[] = new int[usize];
		int a;
		for(int i=0;i<usize;i++){
			System.out.print("Enter Element "+(i+1)+" :");
			a=scan.nextInt();
			arr[i]=a;
		}
		for(int j=0;j<usize;j++){
			System.out.println("Element "+(j+1)+" : "+arr[j]);
		}
        int odd=0;
        int even=0;
		for(int i=0;i<usize;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
		}        
        System.out.println("Number of odd: "+odd);
        System.out.println("Number of odd: "+even);
    }
}
