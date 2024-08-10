package ex_04082024.singleInheritance;

public class Lab107 {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.bhk3();
        s1.bhk2();

        Father f = new Father();
        f.bhk2();
        // f.bhk3(); //Father extends son not possible
    }
}
