package ex_20072024;

public class Lab043 {
    public static void main(String[] args) {
        //JDK> 13

        char code = 'B';

        int val = switch (code){
            case 'A':
                yield 65; //return
            case 'B':
                yield 66; //return
            default:
                throw new IllegalStateException("Unexpected value:"); //Explicit exception handling
        };
        System.out.println(val);
    }
}
