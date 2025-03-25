import java.io.DataInputStream;
import java.io.IOException;

class A {
    int a, b;

    A(int a, int b) {
        System.err.println("class a constructor called");
        this.a = a;
        this.b = b;
    }

    void show() {
        System.err.println("Class A \n");
        System.err.println("Value of A : " + a + "\nValue of B : " + b);
    }
}

class B extends A {
    int c;

    B(int a, int b, int c) {
        super(a, b);
        System.err.println("class b constructor called");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show() {
        System.err.println("\nClass B \n");
        System.err.println("Value of A : " + a + "\nValue of B : " + b + "\nValue of C : " + c);
    }
}

class C extends B {
    int d;

    C(int a, int b, int c, int d) {
        super(a, b, c);
        System.err.println("class c constructor called");

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void show() {
        System.err.println("\nClass C \n");
        System.err.println("Value of A : " + a + "\nValue of B : " + b + "\nValue of C : " + c + "\nValue of D : " + d);
    }
}

public class multilevel {
    public static void main(String[] args) throws IOException {
        DataInputStream dt = new DataInputStream(System.in);
        // int a , b , c ,d;
        System.err.println("Enter the value of W ");
        String w = dt.readLine();
        int W = Integer.parseInt(w); 
        System.err.println(W);

        System.err.println("Enter the value of X ");
        String x = dt.readLine();
        int X = Integer.parseInt(x); 
        System.err.println(X);

        System.err.println("Enter the value of Y ");
        String y = dt.readLine();
        int Y = Integer.parseInt(y); 
        System.err.println(Y);

        System.err.println("Enter the value of Z ");
        String z = dt.readLine();
        int Z = Integer.parseInt(z); 
        System.err.println(Z);

        A a = new A(W, X);
        B b = new B(W, X, Y);
        C c = new C(W, X, Y, Z);

        a.show();
        b.show();
        c.show();

    }
}
