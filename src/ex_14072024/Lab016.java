package ex_14072024;

public class Lab016 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //A -> Exp = 11 | a= 11
        //+ ->
        //B -> Exp = 11 | a= 12
        //+ ->
        //C -> Exp = 12 | a = 13

        //output- A+B+C = 34

        //a
    }
}
