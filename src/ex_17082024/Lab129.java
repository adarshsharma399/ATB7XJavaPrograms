package ex_17082024;

public class Lab129 {
    public static void main(String[] args) {

        String num = "10";
        //int a = (int)num;  ->Not Allowed

        Integer a = Integer.valueOf(num);  //allowed with wrapper class
        System.out.println(a);


        //String to Primitive
        int a2 =Integer.parseInt(num);
        System.out.println(a2);

        //String -> int, Integer
        //Primitive to Wrapper or reverse then we will use this concept.

    }
}
