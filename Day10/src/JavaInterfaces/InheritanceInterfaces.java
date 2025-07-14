
package JavaInterfaces;


interface A {
    void add(int a, int b);
}

interface B {
    void sub(int a, int b);
}

interface C {
    void mul(int a, int b);
}

interface D {
    void div(int a, int b);
}

interface E {
    void mod(int a, int b);
}

interface F {
    void BoxStarPattern();
}

interface G {
    void SquarePattern();
}

interface H {
    void TrianglePattern();
}

interface I {
    void reverseNumber(int num);
}

interface J {
    void checkEvenOdd(int num);
}


public class InheritanceInterfaces implements A, B, C, D, E, F, G, H, I, J {

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Can't divide by zero.");
        }
    }

    public void mod(int a, int b) {
        if (b != 0) {
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Cannot mod by zero.");
        }
    }

    public void BoxStarPattern() {
        System.out.println("Box Star Pattern:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void SquarePattern() {
        System.out.println("Square Pattern (Numbers):");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void TrianglePattern() {
        System.out.println("Triangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    public void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

   
    public static void main(String[] args) {
        InheritanceInterfaces j = new InheritanceInterfaces();

        j.add(10, 5);
        j.sub(10, 5);
        j.mul(6, 3);
        j.div(20, 4);
        j.mod(22, 6);
        j.BoxStarPattern();
        j.SquarePattern();
        j.TrianglePattern();
        j.reverseNumber(12345);
        j.checkEvenOdd(7);
    }
}
