package ex_21072024;

public class Lab064 {
    public static void main(String[] args) {
        for(int i=0; i<=50; i++){
            //System.out.println(i);
            if(i%2==0){
                System.out.println("Even Number: "+i);
                continue;
            }
            System.out.println("Odd Number: "+i);
        }
    }
}
