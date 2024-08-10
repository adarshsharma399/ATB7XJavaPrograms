package ex_04082024;

public class Lab100 {
    public static void main(String[] args) {

        Car c1 = new Car();    //constructor is called when we use with new keyword.
        // ClassName objectRef =  new keyword + ClassName();

        //Car c1;   -> Default constructor is not called.

        new Car();  //New object is created in heap but there is no reference pointing to this object, object is created in Heap

        //2 objects are created
        //constructor will be called 2 times

    }
}
