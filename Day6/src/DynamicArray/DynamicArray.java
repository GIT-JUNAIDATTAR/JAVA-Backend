package DynamicArray;

import java.util.Scanner;

public class DynamicArray {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Size");
		int size = sc.nextInt();
		
		int arr1[]=new int[size];
		
		for(int i = 0;i <size;i++) {
			System.out.println("Array index is -" + i);
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
