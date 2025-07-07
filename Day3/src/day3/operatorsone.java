package day3;

import java.util.Scanner;

public class operatorsone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your marks");
		int per = sc.nextInt();
		
		if(per < 0 ) {
			System.out.print(" invalid marks , type again");
			
		}
		
		else if(per >= 90) {
			System.out.print("garde A");
		}
		
		else if(per >= 70 && per <=80) {
			System.out.print("garde B");
		}
		
		else if (per >= 30 && per <70) {
			System.out.print("garde C");
		}
		
		else {
			System.out.print("fail");
		}
	}
	
}
