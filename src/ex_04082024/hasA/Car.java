package ex_04082024.hasA;

public class Car {
    // Aggregation - hasA
    protected void StartTheCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}