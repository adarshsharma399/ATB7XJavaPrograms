package ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab150 {
    public static void main(String[] args) {
        String path = "C://a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {  //smaller bucket
            //throw new RuntimeException(e);
        } catch (Exception e) {  //Bigger bucket
            System.out.println("Not Found");
        }
    }
}
//219

//We can have multiple catch blocks