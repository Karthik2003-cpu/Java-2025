import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter values of array: ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt(); /*arrays of objects - in heap memory reference values(reference to the actual object are stored continuously and
                                      actual object may be stored in different locations*/
        }

        System.out.println("values of array are: "+ Arrays.toString(arr));

    }
}
