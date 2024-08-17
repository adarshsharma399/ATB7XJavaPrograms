package ex_10082024.Poly.methodOverloading;

public class MathOperations {

    //No need to use different name
//    double add_double(double a, double b){
//        return a+b;
//    }

    // Encapsulation
    private String name;


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int pramod, int dutta, int amit, int mehga) {
        return pramod + dutta;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }

    String add(String a, String b) {
        return a + b;
    }

    String add(String a, int b) {
        return a + b;
    }

    String add(int b, String a) {
        return a + b;
    }

    //Constructors
    MathOperations() {
    }

    MathOperations(int a) {
    }

    MathOperations(int a, int b) {
    }

    MathOperations(int a, int b, int c) {
    }

    MathOperations(int a, int b, int c, String d) {
    }


}