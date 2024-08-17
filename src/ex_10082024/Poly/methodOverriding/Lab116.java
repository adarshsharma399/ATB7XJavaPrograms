package ex_10082024.Poly.methodOverriding;

public class Lab116 {

    // Method overidding | Runtime Poly
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_Ref = new Hound();
        dog_Ref.bark();  //can only access Overridden Functions

        //Hound h2 = new Dog();

        //dog_Ref.bike(); //This isn't overridden function, can not access

    }
}