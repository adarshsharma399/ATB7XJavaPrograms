package ex_27072024;

public class Lab083 {
    public static void main(String[] args) {   //main function will always take string type of argument , no return type with parameter

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        if(args.length >0){
            for(int i = 0; i< args.length; i++){
                System.out.println(args[i]);
            }
        } else {
            System.out.println("No arguments given");
        }

    }
}
