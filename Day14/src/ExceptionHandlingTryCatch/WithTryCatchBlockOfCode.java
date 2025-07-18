package ExceptionHandlingTryCatch;

import java.util.Scanner;

public class WithTryCatchBlockOfCode extends A {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("enter index number");
    	int num = sc.nextInt();
    	
    	m1(num);
    }
}

class A{
	 public static void m1(int n) {
		 
		 try {
			 int	arr1[] = {1,2,3,4,5,6};
				System.out.print(arr1[n]);
		 } catch(Exception e) {
			 e.getMessage();
			 e.printStackTrace();
			 System.out.print("Enter Valid Index Number");
		 }
	 }
}