package Polymorphism;

import java.util.Scanner;

public class MethodOverloading {
    //add
	public static  void ab(int a , int b) {
		
		int result = a + b;
		System.out.println("addition " + result );
	
	}
	//add name + age
	public static void ab(String a,int b) {
		System.out.println("my name is " + a + "and my age is " +b );
	}
	
	//add name and surname
	public static void ab(String a, String b) {
		System.out.println(a + b);
	}
	
	//substract double
	public static void ab(double a, double b) {
		double result = a - b ;
		System.out.println("substraction double" + result);
	}
	
	public static void ab(int a) {
		for(int i=1;i<=a;i++) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		
		ab(4,4);
		ab("junaid", 21);
		ab("junaid ","attar");
		ab(1.1,2.2);
		ab(10);
		
	
	}
	
}
