package ex_24082024.Generics;

public class Lab183 {
    //Example 2 Generic

    public static <T> void temp(T a){ //Generic Method
        System.out.println(a);
    }

    public static void main(String[] args) {
        temp(23);
        temp(4.5);
        temp('d');
        temp("Adarsh");
    }
}
