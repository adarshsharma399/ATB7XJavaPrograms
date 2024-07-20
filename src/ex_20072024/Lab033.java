package ex_20072024;

public class Lab033 {
    public static void main(String[] args) {

        if (true){
            System.out.println("1");
            if(true){
                System.out.println("2");
                if(false){   //it will not go into the loop
                    System.out.println("3");
                    if(true){
                        System.out.println("4");
                    }
                }
            }
        }
    }
}
