package ex_10082024.superthiskeyword;

public class Lab118 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.message();

        Person p1 = new Person();
        p1.message();

        Person p2 = new Student();
        p2.message();
    }

}


class Student extends Person {
    // is A relation - inheritance
    @Override
    void message() {
        System.out.println("I am Student message");
    }

    void display() {
        super.message();
    }


}

class Person {
    void message() {
        System.out.println("I am person message");
    }
}
