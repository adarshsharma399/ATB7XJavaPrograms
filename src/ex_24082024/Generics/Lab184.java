package ex_24082024.Generics;

public class Lab184 {
    public <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c) {  //This class is not static
        DT max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        Lab184 lab = new Lab184(); // Create an object of Lab182

        System.out.println(lab.maximumOf(34, 56, 65));    // Call the method on the object
        System.out.println(lab.maximumOf(4.3, 7.6, 1.3)); // Call the method on the object
        System.out.println(lab.maximumOf('r', 'a', 'f')); // Call the method on the object
    }
}

//Refer Lab182

//Static Methods:
//
//Belong to the class.
//Can be called directly using the class name without creating an instance.
//Example: ClassName.methodName().



//Non-Static (Instance) Methods:
//
//Belong to instances (objects) of the class.
//Require an object of the class to be called.
//Example: objectName.methodName().