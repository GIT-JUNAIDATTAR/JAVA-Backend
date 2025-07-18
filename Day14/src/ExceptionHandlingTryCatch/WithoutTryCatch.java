package ExceptionHandlingTryCatch;

import java.util.Scanner;

public class WithoutTryCatch extends One {
    public static void main(String[] args) {
     
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("enter index number");
    	int num = sc.nextInt();
    	
    	m1(num);
    }
}

class One{
	public static void m1(int n) {
	int	arr1[] = {1,2,3,4,5,6};
	System.out.print(arr1[n]);
	}
}