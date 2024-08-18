package ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab151 {
    //Throws: works with full method, used for exception handling
    //Throw vs Throws

    public static void main(String[] args) throws FileNotFoundException {   //with throws, code looks much cleaner
        readFile();
    }

//    public static void main(String[] args) throws Exception {   //if we don't know what exception to use-> we can directly use Exception
//        readFile();
//    }

    private static void readFile() throws FileNotFoundException, NullPointerException, ArithmeticException { // We can add multiple exception separated by comma
        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file); //to read the file
        System.out.println("End of the Program");

        int a = 10/0;
    }
}
//220