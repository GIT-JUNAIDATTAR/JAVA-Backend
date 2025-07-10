package Functions;

import java.util.Scanner;

public class Functions {
	
	
//Parameterize
	public static void Substraction(int a , int b) {
		int result = a - b;
		System.out.print(result);
	}
	
//without parameterize	
	public static void BoxStarPattern() {
		for(int i =0;i<5;i++) {
	    System.out.println();
		 for(int j = 0 ;j<=5;j++) {
		   System.out.print("*");
				}
			}
		}
		
	
//Parameterize without return
	public static  void Addition(int a , int b) {
		
		int result = a + b;
		System.out.print(result);
	}

//Parameterize with return
	public static int Multiplication (int a , int b) {
		return a * b;
	}
	

//function array
	public static void MyString() {
		
		  String  arr1[]= new String[6]; 
			arr1[0]="Apple";
			arr1[1]="banana";
			arr1[2]="grapes";
			arr1[3]="mango";
			arr1[4]="pineapple";
			arr1[5]="kivi";
		
		for(int i=0;i<6;i++) {
			System.out.println(arr1[i] + " ");
		}
		
	}
	
//	Driving age limit function
	
	public static void Drive(int age){
		
		if(age>=0) {
			
			if(age>18) {
			System.out.print("you can drive ");
			}
			
			else {
				System.out.print(" you cant drive");
			}
		}
		
		else {
			System.out.print("Enter valid age");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Subtraction(30,10);
		
//		Addition(10,10);
		
//		System.out.print(Multiplication(4,4));
		
//		BoxStarPattern();
		
		MyString();
		
//		System.out.print("Enter your age here");
//		int age = sc.nextInt();
//		Drive(age);
		
		
	}
}
