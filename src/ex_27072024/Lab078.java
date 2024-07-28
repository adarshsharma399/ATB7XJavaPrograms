package ex_27072024;

public class Lab078 {
    public static void main(String[] args) {
        //Arrays
        //Declaration and Initialization
        //dataType[] arrayName;

        //Array name should be in camel-case notation

        int [] marks_10_Board = {90, 95, 91, 56, 78, 69};

        // len -> 6
        System.out.println(marks_10_Board.length);

        // index 3 -> 56

        System.out.println(marks_10_Board[3]);
        System.out.println(marks_10_Board[4]);
       // System.out.println(marks_10_Board[-1]);  //Index bound exception
        //System.out.println(marks_10_Board[10]); //index out of bound error

    }
}
