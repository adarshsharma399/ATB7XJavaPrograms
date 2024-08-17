package ex_11082024.ExCar;

public class Tesla extends Engine{

    void drive(){
        openCar();
        start();
        partGearbox();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");

    }

    @Override
    void speed() {
        System.out.println("300km.hr");

    }

    @Override
    void partGearbox() {

    }

    @Override
    void openCar() {

    }
}