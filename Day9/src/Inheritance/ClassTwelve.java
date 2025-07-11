package Inheritance;

public class ClassTwelve extends ClassThirteen {

	 public static void patternRightAlign(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int s = n - i; s > 0; s--) System.out.print("  ");
	            for (int j = 1; j <= i; j++) System.out.print("* ");
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        patternRightAlign(5);
	    }
}
