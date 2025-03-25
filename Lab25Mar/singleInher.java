
class Parent{
    String name ;
    int age;

    Parent(String name , int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.err.println("Name of parent : " + name + " Age of parent : " + age);
    }
}


class Child extends Parent{
   
    Child(String name , int age){
        super(name, age);
        this.name = name;
        this.age = age;
    }

    void show(){
        System.err.println("Name of child : " + name + " Age of child : " + age);
    }
}


class singleInher{
    public static void main(String args[]){
        Parent p = new Parent("Ram", 99);
        Child c = new Child("shyam", 45);

        p.show();
        c.show();
    }
}