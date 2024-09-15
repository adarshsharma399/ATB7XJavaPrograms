package ex_24082024.Generics;

public class Lab181 {
    //Generics
    //MaxThreeNumbers

    public static void main(String[] args) {
        //34, 54, 76
        //4.2, 3.4, 1.2
        //p, z, a
        int maxOutput = maximumNumberOf(34, 56, 76);
        System.out.println(maxOutput);

        double maxOutputDouble = maximumNumberOf(4.2, 3.4, 1.2);
        System.out.println(maxOutputDouble);

        String maxOutputString = String.valueOf(maximumNumberOf('a', 'p', 'z'));
        System.out.println(maxOutputString);
    }

    public static int maximumNumberOf(int a, int b, int c){
        int max = a;
        if(b> max){
            max = b;
        }
        if(c> max){
            max = c;
        }
        return max;
    }

    public static double maximumNumberOf(double a, double b, double c){
        double max = a;
        if(b> max){
            max = b;
        }
        if(c> max){
            max = c;
        }
        return max;
    }

    public static String maximumNumberOf(String x, String y, String z){
        String max = x;
        if(y.compareTo(max)> 0){
            max = y;
        }
        if(z.compareTo(max)> 0){
            max = z;
        }
        return max;
    }

}

//Here I have to write 3 methods separately, To fix this we can make use of Generics concept

//check Lab182
