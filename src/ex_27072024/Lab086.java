package ex_27072024;

public class Lab086 {
    public static void main(String[] args) {

        //1-D Array
        int arr [] = {1,2,3};  //Hardcoding of values
        int arr2[] = new int[3];  //length ->3

        //Multi-dimensional array- have 2 or more dimensions, representing a table or grid of elements
        // 2D, 3D

        //2D
        int arr_2d [][] = new int[3][3];
        // |0|0|0|
        // |0|0|0|
        // |0|0|0|

        arr_2d [0][0] = 34;
        // |34|0|0|
        // |0|0|0|
        // |0|0|0|

        arr_2d [0][1] = 24;
        // |34|24|0|
        // |0|0|0|
        // |0|0|0|

        arr_2d [2][2] = 4;
        // |34|24|0|
        // |0|0|0|
        // |0|0|4|


    }
}
