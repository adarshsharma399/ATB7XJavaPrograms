package ex_04082024;

public class ATBPerson {
    String name;
    long phone;

    //Default constructor

    ATBPerson() { //Default Constructor
        System.out.println("Object is created!");
    }

    ATBPerson(String nameGiven){  //Parameterized Constructor
        this.name =  nameGiven;

        //this basically means current class
    }

    ATBPerson(String nameGiven, long phoneNumber){  //Parameterized Constructor
        this.name = nameGiven;
        this.phone = phoneNumber;
    }
}
