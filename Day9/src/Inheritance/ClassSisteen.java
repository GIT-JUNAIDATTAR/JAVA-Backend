package Inheritance;

public class ClassSisteen extends ClassSeventeen {

    public static void patternDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2*i - 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2*i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternDiamond(5);
    }
}
