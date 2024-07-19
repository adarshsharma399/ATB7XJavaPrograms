package ex_14072024;

public class Lab011 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
       // byte c = a+b; -> byte and byte> int is the result type

        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';

       // char c1 = a1+b1;  -> we can't combine AB as character as it AB is not a character

        int c1 = a1+b1;

        System.out.println(c1);  //(65+66) > ASCII value of A and B
        System.out.println('A' == 65); //characters are ASCII values only
        System.out.println('B' == 66);

        short s2 = 10;
        char c2 = 'A';

        int ss = s2+c2;
        System.out.println(ss); //75 is the answer

    }
}
