package Inheritance;

public class ClassSeventeen extends ClassEighteen{

	  public static void patternHollowPyramid(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int s = n - i; s > 0; s--) System.out.print(" ");
	            for (int j = 1; j <= (2*i - 1); j++) {
	                if (j == 1 || j == (2*i - 1) || i == n)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        patternHollowPyramid(5);
	    }
}
