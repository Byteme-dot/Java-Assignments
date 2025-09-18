import java.util.*;

public class ArrayDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int usize;
		System.out.println("Enter array size: ");
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
		System.out.print("Enter element to search: ");
		int search = scan.nextInt();
		boolean searchcheck = false;
		for(int k=0;k<usize;k++){
			if(arr[k]==search){
				System.out.println("Your Element exists on index number: "+k);
				searchcheck = true;
			}
		}
		if(searchcheck == false){
			System.out.println("Element not found");
		}	
		int max=arr[0];
		int min=arr[0];
		for(int l=1;l<usize;l++){
			if(arr[l]<min){
				min=arr[l];
			}
		}	
		System.out.println("Min element = "+min);
		for(int m=1;m<usize;m++){
			if(arr[m]>max){
				max=arr[m];
			}
		}			
		System.out.println("Max element = "+max);
	}
}
		