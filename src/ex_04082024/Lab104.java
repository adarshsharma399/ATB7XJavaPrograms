package ex_04082024;

public class Lab104 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson();
        p1.name = "Adarsh"; //but this is after the object is created

        System.out.println(p0.name); //no value set in constructor, default constructor. Hence, null
        System.out.println(p1.name); //Adarsh
        System.out.println(p1.phone); //0


        ATBPerson p2 = new ATBPerson("Pramod");
        System.out.println(p2.name);
        System.out.println(p2.phone);
        ATBPerson p3 = new ATBPerson("Praveen", 382721432);

        System.out.println(p3.phone);
        System.out.println(p3.name);

    }
}
