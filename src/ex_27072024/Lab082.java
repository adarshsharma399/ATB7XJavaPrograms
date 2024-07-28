package ex_27072024;

public class Lab082 {
    public static void main(String[] args) {

        final float pi = 3.14f;

        //Disadvantage of array
        //1. Fixed data type
        //2. Fixed length
        //3. Wastage of memory

        int ages[] = new int[100];
        ages[1]= 68;
        ages[1]= 56;  //we can change the value
        System.out.println(ages[1]); //0, 99, 0,0,0,....


    }
}
