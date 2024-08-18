package ex_18082024;

public class Lab149 {
    //Exception passing
    public static void main(String[] args) {
         extracted();
    }

    private static void extracted(){
        extracted1();
    }

    private static void extracted1(){
        try {
            Integer i[] = new Integer[2];
            System.out.println(i[3]);   //unchecked- ArrayIndexOutofBoundException
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("ArrayIndexOutofBound");
        } finally {
            //File.close, sc.close, sqlconnection.close
            System.out.println("End of the Program");
        }
    }
    //218
}


//Exception will be added to line 14th and 15th (try/catch) as it is vulnerable code