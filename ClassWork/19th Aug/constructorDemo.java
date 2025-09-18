import java.util.*;

public class constructorDemo{
	int value1;
	int value2;
	public static void main(String[] args){
		constructorDemo(){
			value1=100;
			value2=50;
		}
		
		System.out.println("Non parameterised \n Value 1 = "+value1+" Value 2 = "+value2);
		
		constructorDemo(int value1,int value2){
			this.value1 = value1;
			this.value2 = value2;
		}
		
		System.out.println("\n Parameterised \nValue 1 = "+value1+" Value 2 = "+value2);
	}
}
		
		
		 

