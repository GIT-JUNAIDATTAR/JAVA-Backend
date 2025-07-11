package Inheritance;

public class ClassEleven extends ClassTwelve {

    public static void patternIndentedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space < i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternIndentedTriangle(5);
    }
}
