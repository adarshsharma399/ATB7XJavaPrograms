package ex_27072024;

import java.util.Arrays;

public class Lab085 {

    public static void main(String[] args) {

        //Find the max in the Arrays
        // Find the maximum Salary in the Array

        int salaries[] = {7, 10, 5, 6, 14, 25, 6, 24, 8};

        int max = 1;
        int min = salaries[0];

        for(int i =0; i<salaries.length; i++){
            if (salaries[i]> max){
                max = salaries[i];
            }
            if(min > salaries[i]){
                min = salaries[i];
            }
        }

        System.out.println("Max Salary is: "+ max);
        System.out.println("Max Salary is: "+ min);

        //Alternate Way
        Arrays.sort(salaries);  //Sort the array -> Ascending order
        System.out.println(salaries[salaries.length-1]);
    }
}
