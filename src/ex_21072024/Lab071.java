package ex_21072024;

public class Lab071 {
    public static void main(String[] args) {

       //Function - Block of code which we can re-use
        //Pre-built functions and User -defined function

        int result = Math.max(3,4); //pre-built function
        System.out.println(result);

        //Two components of a functions
        // 1. Define
        // 2. Call the function


        //Calling the function
        greet();

        for(int i =0; i<5; i++){
            greet();
            greet2();
        }

    }

    //Define Function
    static void greet(){
        System.out.println("Hi, How are you?");
    }

    //Function inside main is not allowed
    //Function with same name isn't allowed
    static void greet2(){
        System.out.println("Hi, What is your name?");
    }

}