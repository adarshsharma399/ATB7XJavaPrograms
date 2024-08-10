package ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; //Instance variable

    //Default Constructor
     BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    //Parameterized constructor- 3 Arguments
    BankAccount(String bname, int bal, String bCode){
        this.bankName = bname;
        this.balance = bal;
        this.bankCode = bCode;
    }

    BankAccount(String bName,int bal){
        this.bankName = bName;
        this.balance = bal;

    }

    BankAccount(String bName){
        this.bankName = bName;
    }

    void printDetails(){
        System.out.println("Bank Name-> "+ bankName);
        System.out.println("Bank Code-> "+ bankCode);
        System.out.println("Balance -> "+ balance);
    }

}
