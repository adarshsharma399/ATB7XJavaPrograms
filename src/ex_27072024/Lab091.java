package ex_27072024;

import java.util.Arrays;

public class Lab091 {
    public static void main(String[] args) {

//        How to Find the Second Highest Salary in the Array?
//        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int salaries[] = {7, 10, 18, 13, 25, 4, 9, 8, 17};

        int max = salaries[0];
        int second_max = salaries[0];

        for(int i=0; i< salaries.length; i++){
            if(salaries[i]>max){
                second_max = max;
                max = salaries[i];
            }
            else if(salaries[i]> second_max && salaries[i]!= max){
                second_max = salaries[i];
            }
        }

        System.out.println("Max Salary is: "+max);
        System.out.println("Second Max Salary is: "+second_max);

//        Arrays.sort(salaries);  //Sort the array -> Ascending order
//        System.out.println("Second Highest: "+salaries[salaries.length-2]);



    }
}
