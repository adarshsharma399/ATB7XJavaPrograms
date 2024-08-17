package ex_10082024.Poly.methodOverriding.Ex;

public class Cat extends Animal {
    @Override
    void sound() {
        //super.sound();
        System.out.println("Cat Meows");
    }

}

// @Override - The @Override annotation should be placed above
// a method in a subclass that is intended to override a method from its superclass.