package Inheritance;

public class ClassFifteen extends ClassSisteen {

	 public static void patternInvertedRight(int n) {
	        for (int i = n; i >= 1; i--) {
	            for (int s = 0; s < n - i; s++) System.out.print("  ");
	            for (int j = 1; j <= i; j++) System.out.print("* ");
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        patternInvertedRight(5);
	    }
}
