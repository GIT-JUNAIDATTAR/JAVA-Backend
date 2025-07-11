package Inheritance;

import java.util.Scanner;

public class ClassTenth extends ClassEleven {

	public static void possitive() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Size");
		int size = sc.nextInt();
		
		int arr1[]=new int[size];
		
		for(int i = 0;i <size;i++) {
			System.out.println("Array index is -" + i);
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			//System.out.print(arr1[i]+" ");
			if(arr1[i]<0) {
				System.out.print(arr1[i] + " is nigative");
			}
			
			if(arr1[i]%2==0) {
				System.out.println(arr1[i]+"  is even");
			}
			
			else {
				System.out.println(arr1[i]+" is odd");
			}
		}
		
	}
}
