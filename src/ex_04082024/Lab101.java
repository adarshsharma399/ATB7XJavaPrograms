package ex_04082024;

public class Lab101 {

    int e = 45;    //instance variable, It is not equal to global variable. There is no concept of global variable in Java.

    void f1(){
        int e = 10;  // e is local variable , within this piece of code
        System.out.println(e);  //will print 10
    }

    void f2(){
        System.out.println(e);     //will print 45, global variable
    }


}
