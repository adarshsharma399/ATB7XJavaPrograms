package ex_21072024;

public class Lab063 {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){
            System.out.println(i);
            if(i ==5){
                continue;   //continue keyword is used to skipping the remaining program, After will not be printed
            }
            System.out.println("After");
        }
    }
}
