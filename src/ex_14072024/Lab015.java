package ex_14072024;

public class Lab015 {
    public static void main(String[] args) {

        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        int result1 = ++a;
        System.out.println(result1);

        System.out.println(a++ + a);
        // A = a++ -> 10, a = 11
        //+
        //B = a = 10

        System.out.println(a++ + ++a);
        // A : Exp= 11, a = 11
        // + :
        // B : Exp = 11, a = 11 now, a = a+1 , a= 12
        //output will be 22

        System.out.println(++a + ++a);
        System.out.println(a);
        //A => ++a, Exp= 11   |  a = 11
        //+
        //B => ++a, Exp = 12  | a = 12
        // Exp = A+B = 23, a = 12


        //a-- and --a
    }
}
