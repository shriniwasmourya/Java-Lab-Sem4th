import java.util.*;
class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter animal type (dog/cat): ");
        String choice = scanner.nextLine().toLowerCase(); 
        
        if (choice.equals("dog")) {
            Dog dog = new Dog();
            dog.sound();
            dog.bark();
        } else if (choice.equals("cat")) {
            Cat cat = new Cat();
            cat.sound();
            cat.meow();
        } else {
            System.out.println("Invalid choice! Please enter 'dog' or 'cat'.");
        }
    }
}



 


