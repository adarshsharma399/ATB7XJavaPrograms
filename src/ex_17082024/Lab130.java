package ex_17082024;

public class Lab130 {
    public static void main(String[] args) {

        Double d = 3.14; //Wrapper class  //Stored in Heap area

        double val = d.doubleValue();  //normal primitive type   //stored in Continuous memory

        System.out.println(d);
        System.out.println(val);


        String s1 = "Adarsh"; //SCP
        String s2 = new String("Adarsh"); //Heap


    }
}
