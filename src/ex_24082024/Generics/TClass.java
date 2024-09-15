package ex_24082024.Generics;

//Generic Class Example

public class TClass {

    public static void main(String[] args) {

        Test <Integer> i = new Test <Integer>(5);
        System.out.println(i.getObject());

        Test <Double> i2 = new Test<Double>(5.2);
        System.out.println(i2.getObject());

        Test<String> i3 = new Test<String>("Adarsh");
        System.out.println(i3.getObject());
    }

}


class Test <T> {
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}