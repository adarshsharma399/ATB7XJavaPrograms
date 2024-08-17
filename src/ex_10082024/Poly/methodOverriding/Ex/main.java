package ex_10082024.Poly.methodOverriding.Ex;

public class main {
    public static void main(String[] args) {
        Animal myDog = new Animal();
        myDog.sound();

        Cat myCat = new Cat();
        myCat.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}
