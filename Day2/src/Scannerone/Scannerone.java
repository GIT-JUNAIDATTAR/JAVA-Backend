package Scannerone;

import java.util.Scanner;

public class Scannerone {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter your name");
	String name = sc.nextLine();
	
	System.out.print("enter your age");
	int age = sc.nextInt();
	
	System.out.print("my name is " + name + " and my age is " + age);
}
}
