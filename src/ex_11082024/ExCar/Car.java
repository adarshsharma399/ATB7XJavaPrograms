package ex_11082024.ExCar;

class Car extends Engine{
    //Engine
    //GearBox
    //Keys

    //Tesla is a type of Car  -> extends Car
    //Tesla - Drive() function

    //user will only see Tesla and drive function
    //Behind this, Tesla is using Car class which will be hidden from the user

    //Static methods are allowed in Abstract class and Interfaces both
    //Default methods are only allowed in Interfaces

    @Override
    void openCar() {
        System.out.println("Open Car with keys");
    }

    @Override
    void partGearbox() {
        System.out.println("Part of GearBox");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

    @Override
    void speed() {
        System.out.println("Car");
    }

    @Override
    void start() {
        System.out.println("Start a Car");
    }
}