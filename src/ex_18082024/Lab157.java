package ex_18082024;

public class Lab157 extends Object {  //This is the ultimate parent
    public static void main(String[] args) {

        String name = "Adarsh";
        String name2 = "adarsh";

        if( name.equalsIgnoreCase(name2)){ //ignoring the case
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}


//226

//final -> constant
//finally -> block of code with the try and catch
//finalize -> Object class function - threading use case