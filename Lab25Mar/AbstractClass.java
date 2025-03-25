import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
abstract class A{
    abstract void add(int a , int b);
}


class B extends A{
    void add(int a  , int b){
        int result = a+b;
        System.err.println("Add of a and b : " + result);
    }
}
public class AbstractClass {
    public static void main(String[] args) throws IOException{
        DataInputStream dt = new DataInputStream(System.in);
        System.err.println("Enter the value of A ");
        String M = dt.readLine();
        int m = Integer.parseInt(M);

        System.err.println("Enter the value of B ");
        String N = dt.readLine();
        int n = Integer.parseInt(N);
        B a = new B();
        a.add(m, n);
    }
}
