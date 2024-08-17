package ex_17082024;

public class Lab134 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");   // Create the outer class instance
        c.drive();
        System.out.println(c.make);

        // to access the inner class Object creation.
        Car.GearBox cg = c.new GearBox();  // Create the inner class instance using the outer class instance
        cg.m2();

    }
}


class Car {
    String make;

    public Car(String make){
        this.make = make;
    }

    //Method
    void drive(){
        System.out.println("You can drive car");
    }

    //Innerclass- Use to Hide the functionalities
    class GearBox{
        void m2(){
            System.out.println("m2");
        }
        class NutBolts {

        }
    }

}

//202