package ex_27072024;

public class Lab087 {
    public static void main(String[] args) {

        int array_2d[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i =0; i<array_2d.length; i++){
            for(int j=0; j<array_2d[i].length; j++){
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
