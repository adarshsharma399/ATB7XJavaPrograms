package ex_17082024;

public class Lab131 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a.age = 12;
        System.out.println(A.discount);
        A.m1(); //static -> doesn't need object reference
        a.m2();
    }
}

class A{
    int age = 10; //instance variable
    static int discount = 199; //static variable

    //Static Initialization Block
    static {
        System.out.println("SIB-A");
    }

    //Instance Initialization Block
    {
        System.out.println("IIB");  //IIB is called when we create an object
    }
    static void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }
}
