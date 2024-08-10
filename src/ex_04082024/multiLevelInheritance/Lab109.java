package ex_04082024.multiLevelInheritance;

public class Lab109 {
    public static void main(String[] args) {
        //MultiLevel Inheritance
        //Grandfather -> father -> Child

        Child c1 = new Child();
        c1.home(); // If name is same C -> F -> GF
        c1.c();
        c1.gf();
        c1.f();
    }
}