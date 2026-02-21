import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
//        int[][] arr2d = { // each row is a array object
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        int[][] arr2d = new int[3][3];
        System.out.println(arr.length); //length function returns the no of row of a 2d array

        System.out.println(Arrays.toString(arr2d[2]));

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++)/* for variable columns in 2d array, the inner loop takes the length of all the row(row array) separatly
                                                              ,or we can say it takes size of row(every row is an array)*/ {
                arr2d[row][col] = sc.nextInt();
            }
        }

//        for (int row = 0; row < arr2d.length; row++) {
//            for (int col = 0; col < arr2d[row].length; col++)/* for variable columns in 2d array, the inner loop takes the length of all the row(row array) separatly
//                                                              or we can say it takes size of row(every row is an array)*/ {
//                System.out.print(arr2d[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int row = 0; row < arr2d.length; row++) {
//            System.out.println(Arrays.toString(arr2d[row])); //each element of a row is an array itself, that is why we can print it using Arrays.toString().
//        }

        for(int[] a : arr2d) //enhanced for loop also called for each loop
        {
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}
