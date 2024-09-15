package ex_24082024.Generics;

public class Lab182 {
    //Max Three

    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c){

        DT max = a;
        if(b.compareTo(max)> 0){
            max = b;
        }
        if(c.compareTo(max)> 0){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34, 56, 65));
        System.out.println(maximumOf(4.3, 7.6, 1.3));
        System.out.println(maximumOf('r', 'a', 'f'));

    }
}

//Strings can be compared only using compareTO method that is why we have extended Comparable