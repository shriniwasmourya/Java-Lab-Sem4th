import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;

class StaticKey {
    static String appName;
    static String collegeName;
    String studentName;

    static {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter application name: ");
            appName = dis.readLine();
            dis.close();
        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }

    StaticKey(String studentName) {
        this.studentName = studentName;
    }

    static int add(int a, int b) {
        return a + b;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("Application Name: " + appName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name: ");
        collegeName = sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        StaticKey student = new StaticKey(name);
        student.display();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum: " + add(num1, num2));

        sc.close();
    }
}


