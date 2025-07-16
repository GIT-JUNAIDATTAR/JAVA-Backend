package Polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {
        A a = new A();
        a.calculate(5, 5);

        B b = new B();
        b.calculate(5, 5);

        C c = new C();
        c.calculate(5, 5);

        D d = new D();
        d.calculate(5, 5);

        E e = new E();
        e.calculate(5, 5);

        F f = new F();
        f.calculate(5, 5);

        G g = new G();
        g.calculate(5, 5);

        H h = new H();
        h.calculate(5, 5);

        I i = new I();
        i.calculate(5, 5);

        J j = new J();
        j.calculate(5, 5);
    }
}

class A {
    public void calculate(int a, int b) {
        System.out.println("A - * * * * *");
    }
}

class B extends A {
    public void calculate(int a, int b) {
        System.out.println("B - *");
        System.out.println("  *");
        System.out.println("    *");
    }
}

class C extends B {
    public void calculate(int a, int b) {
        for (int i = 0; i < 3; i++) {
            System.out.println("* * *");
        }
    }
}

class D extends C {
    public void calculate(int a, int b) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class E extends D {
    public void calculate(int a, int b) {
        System.out.println("E - Sum: " + (a + b));
    }
}

class F extends E {
    public void calculate(int a, int b) {
        System.out.println("F - Product: " + (a * b));
    }
}

class G extends F {
    public void calculate(int a, int b) {
        System.out.println("G - Subtract: " + (a - b));
    }
}

class H extends G {
    public void calculate(int a, int b) {
        System.out.println("H - Division: " + (a / b));
    }
}

class I extends H {
    public void calculate(int a, int b) {
        System.out.println("I - Modulus: " + (a % b));
    }
}

class J extends I {
    public void calculate(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("J - Swapped: a = " + a + ", b = " + b);
    }
}
