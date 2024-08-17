package ex_17082024;

public class Lab132 {
    public static void main(String[] args) {
        APIAutomation a = new APIAutomation();
        //SIB - called only 1 time
        //IIB- when object is created
    }

}

class APIAutomation{

    static{
        //load data from MySQL
        System.out.println("Loading data from MYSQL");
    }

    {
        //Code to load data from CSV file
        System.out.println("Loading data from CSV");
    }
}
