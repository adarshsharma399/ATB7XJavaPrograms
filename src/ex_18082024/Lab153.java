package ex_18082024;

public class Lab153 {
    public static void main(String[] args) throws Exception {
        //throw: used for custom exception

        Bank sbi = new Bank("INR", 100);

//        Bank icici = new Bank("INR", 10);
//
//        Integer total = sbi.add(icici);
//        System.out.println(total);


        Bank jpmorgan = new Bank("USD", 89);

        Integer totalnew = sbi.add(jpmorgan);  //this is incorrect
        System.out.println(totalnew);

        //This will throw Currency doesn't match! exception
        //Refer Bank class

    }
}
