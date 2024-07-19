package ex_13072024;

public class Lab008 {

    public static void main(String[] args) {
        final double PIE = 3.14; //value can't be changed- final keyword

        //In order to create a constant - use final keyword

        double a = 34;
        double b = 10;

        double result = a%b; //%- modulus operator- Remainder
        System.out.println(result);
        System.out.println(89/10);  //-Quotient

        //int enum = 45; //enum is a keyword, can't use as variable
        int Enum = 45;

        //Escape characters

        char c = '\n'; //new line/Next line
        char c1 = '\t'; //ADD TAB
        char c2 = '\b'; //Backlash, delete 1 char
        char c3 = '\r'; //Backlash, delete 1 word

        System.out.println("Adarsh"+ c1 + "Sharma");

        char newLine = '\n';
        char tab = '\t';
        char backspace = '\b';
        char carriageReturn = '\r';

        System.out.println("Example of new line:" + newLine + "New line");
        System.out.println("Example of tab:" + tab + "Tabbed text");
        System.out.println("Example of backspace:AB" + backspace + "C"); // Output will be "AC"
        System.out.print("Example of carriage return:Hello" + carriageReturn + "World"); // Output will be "World"

    }
}
