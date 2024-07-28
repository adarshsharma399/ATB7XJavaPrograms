package ex_28072024;

public class Lab094 {
    public static void main(String[] args) {

        //Class -> Attribute (Properties) and Behavior (Methods)

        //Object -> Real entity created from Class
        //Syntax
        //ClassName Classref = new ClassName();
        // Object -> new ClassName();
        //ClassName-> which blueprint you want to use


        BuildingBP dlf = new BuildingBP();  //dlf is reference,  new BuildingBP(); is object created
        dlf.name = "DLF Promenade";

        BuildingBP Prestige = new BuildingBP();
        Prestige.color = "Blue";
    }
}
