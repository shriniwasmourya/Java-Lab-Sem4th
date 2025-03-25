import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

class A{
    String name;
    int age;

    A(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Your Name : "+name);
    }

    void showAge(int age){
        this.age = age;
        System.out.println("Your Age : "+this.age);
    }
}

class B extends A{
    String name;

    B(String name){
        super(name);
        this.name = name;
    }

    void show(){
        System.out.println("Your Name : "+name);
    }
}
class StaticConcept{
    static int counter;

    StaticConcept(int counter){
       this.counter = counter;
       counter++;
    }

    void showCount(){
        System.out.println(counter);
    }
}
class Main{
    public static void main(String args[]) throws IOException{
        String nameA ;
        String nameB;
        int age;
        Scanner sc = new Scanner(System.in);


        // System.out.println(("Enter ur name for class A"));
        // nameA = sc.nextLine();
        // A obj1 = new A(nameA);
        // obj1.show();


        // System.out.println(("Enter ur name for class B "));
        // nameB = sc.nextLine();
        // B obj2 = new B(nameB);
        // obj2.show();

        // //DataInputStream

        // DataInputStream dis = new DataInputStream(System.in);
        // System.out.println(("Enter age "));
        // age = Integer.parseInt(dis.readLine());
        // obj1.showAge(age);

        //Que {Static Keyword}
        int c = 1;
        StaticConcept obj3 = new StaticConcept(c);
        obj3.showCount();

        StaticConcept obj4 = new StaticConcept(c);


        StaticConcept obj5 = new StaticConcept(c);
    }
}