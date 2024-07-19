package ex_14072024;

public class Lab022 {
    public static void main(String[] args) {
        String s1 = "Adarsh";
        //Non-Primitive Types- String,

        String password = "Adarsh@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        //pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Adarsh@123 = adarsh@123 = ADARsh@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf(0));

    }
}
