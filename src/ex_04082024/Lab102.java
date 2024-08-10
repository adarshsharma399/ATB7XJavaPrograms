package ex_04082024;

public class Lab102 {
    String name;


    void talk(){};

    //Blueprint should not have main function. It should be in separate class else we will
    //not be able to ue it in some other class as we will have one main function in another class
    //calling main function here in this blueprint.

    public static void main(String[] args) {
        Lab102 lab = new Lab102();
    }
}
