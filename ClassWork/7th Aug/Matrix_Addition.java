import java.util.*;

public class Matrix_Addition{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int Matrix1[][] = new int[3][3];
		int Matrix2[][] = new int[3][3];
		int a;
		System.out.println("---For Matrix 1---\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("Enter Element ("+(i+1)+","+(j+1)+"): ");
				a = scan.nextInt();
				Matrix1[i][j]=a;
			}
		}
		System.out.println("---Your Matrix 1---\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(Matrix1[i][j]+"\t");
			}
			System.out.print("\n");
		}		
		System.out.println("\n---For Matrix 2---\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("Enter Element ("+(i+1)+","+(j+1)+"): ");
				a = scan.nextInt();
				Matrix2[i][j]=a;
			}
		}	
		System.out.println("---Your Matrix 2---\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(Matrix2[i][j]+"\t");
			}
			System.out.print("\n");
		}	
		System.out.println("\n---Addition of Both Matrix---\n");	
		int Matrix3[][] = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				Matrix3[i][j]=Matrix1[i][j]+Matrix2[i][j];
			}
		}	
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(Matrix3[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}