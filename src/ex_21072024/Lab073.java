package ex_21072024;

public class Lab073 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i <= 4) {
                System.out.println(i);
                continue;
            }
            if (i == 5) {
                System.out.println(i);
                continue;
            }
            break;
        }



        int j = 0;

        while(j < 10){

            if (j%2 ==0){

                System.out.println("Even -->" + j);

            }
            j++;
        }
    }
}