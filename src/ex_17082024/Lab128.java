package ex_17082024;

public class Lab128 {
    public static void main(String[] args) {

        //Primitive to Wrapper class
        int a =10;
        Integer b = a;

        System.out.println(a);
        System.out.println(b);  //extra utilities are added

        //Wrapper class to Primitive ->we loose the extra functionalities
        Integer a2 = 42;  //Auto Boxing -> int is converted to Integer ->Primitive data type is converted to Wrapper class
        int value = a2; //UnBoxing -> Integer to int value
        System.out.println(a2);
        System.out.println(value);
    }
}
