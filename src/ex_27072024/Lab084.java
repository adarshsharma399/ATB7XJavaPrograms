package ex_27072024;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        //Take user input of 5 subjects and calculate average

        Scanner sc = new Scanner(System.in);
        float marks[] = new float[5];
        System.out.println("Enter the marks of Subject 1: ");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the marks of Subject 2: ");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of Subject 3: ");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks of Subject 4: ");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks of Subject 5: ");
        marks[4] = sc.nextFloat();

        float avg = (marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4])/5;

        System.out.println("Avg is: "+ avg);


        //Alternate way

        float [] marks1 = new float[5];
        for (int i = 0; i < marks1.length; i++) {
            System.out.println("Enter the marks of the sub " + (i + 1));
            marks1[i] = sc.nextFloat();
        }

//        // Optionally, you can print out the marks to verify input
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
//        }


        float avg1 = (marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4])/5;
        System.out.println("Avg is -> "+avg1);

        int j = 0;
        while (j < marks1.length){
            System.out.println(marks1[j]);
            j++;
        }

        sc.close();

    }
}
