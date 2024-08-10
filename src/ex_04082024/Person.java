package ex_04082024;

public class Person {
    String name;
    int Id;


    // Special method with same name as the class name- Constructor
    Person(){
        System.out.println("Hi, I will be called, Object is created!");
    }

    void talk(){
        System.out.println("I am talking");
    }
}
