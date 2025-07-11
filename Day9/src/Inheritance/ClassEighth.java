package Inheritance;

public class ClassEighth extends ClassNine{

	public static void pyramid() {
		for(int i = 1; i<=5;i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
