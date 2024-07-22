package ex_21072024;

public class Lab054 {
    public static void main(String[] args) {
        final boolean b1= true;
        //b1 value can't be changed as we have used final keyword

    //    for(int i=0;b1;i++){
    //        System.out.println(i);  //Infinite
    //    }

    //    for(int x=0;;){   //no condition means infinite loop
    //        System.out.println("Hello");  //Infinite
    //    }

        for(float f=0;f<10.67;f++){
            System.out.println("Hi,float: "+ f);

        //for loop -> char, float, int, short, byte, double, long > all primitive data type is supported.

        }
    }
}
