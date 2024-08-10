package ex_04082024;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        System.out.println(ba1.bankName);

        ba1.printDetails();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Bank Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");
        String bCode = sc.next();

        BankAccount ba2 = new BankAccount(bName, bal, bCode);

        System.out.println(ba2.bankName);
        ba2.printDetails();


        BankAccount baicici = new BankAccount("Icici", 100, "ICICI001");
        System.out.println(baicici.bankName);
        baicici.printDetails();

        sc.close();


    }
}