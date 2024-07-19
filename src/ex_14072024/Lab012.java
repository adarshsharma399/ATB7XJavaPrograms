package ex_14072024;

public class Lab012 {
    public static void main(String[] args) {

        //Type Casting - Source and Destination conversion
        //Narrowing and Widening are the types of Typecasting

        //Widening- process of converting lower type to higher type. This is a safe conversion.
        byte b = 10;
        int a = b; //VALID- Implicit Casting - JVM
        int a1= (int)b; //VALID- Explicit Casting

        //Narrowing- Converting higher type to lower type
        int val = 300;
        //byte b1 = val;//INVALID:Implicit Casting > This is not possible, we are putting large bucket to small bucket
        byte b1 = (byte)val; // VALID: Explicit Casting > This is possible

        //300 converted to binary (32 bits)> binary bits will converted to byte 8 bits > last 8 bits of 300 32 bits will be taken> Answer is 44.

        System.out.println(b1);



    }

}
