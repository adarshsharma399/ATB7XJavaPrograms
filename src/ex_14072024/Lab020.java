package ex_14072024;

public class Lab020 {
    public static void main(String[] args) {
        String s1 = "Adarsh";
        String s2 = s1;
        System.out.println(s2);
        String s3 = s2.toLowerCase();
        System.out.println(s3);

        String str1 = "Hello";
        String str2 = "Guys";
        String str3 = "Hello Guys";
        String str4 = str1.concat(str2); //Hello Guys
        //SCP - 4 strings

        String name = "TTA"; //SCP
        String name1 = "TTA"; //SCP

        String name2 = new String("TTA");

        System.out.println(name == name1);  //check for the reference
        System.out.println(name.equals(name1)); //check for the content

        System.out.println(name == name2);
        System.out.println(name1.equals(name2)); //true
    }
}
