import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for(int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//
//        System.out.println("enter array list values: ");
//        for(int i = 0; i < 3; i++)
//        {
//            for(int j = 0; j < 3; j++)
//            {
//                list.get(i).add(in.nextInt()); //adding values to the ith ArrayList of the main ArrayList
//            }
//        }
//
//        System.out.println(list);
//
//        int[][] array = new int[3][];
//        for(int i = 0; i < array.length; i++)
//        {
//            array[i] = new int[3];
//        }

        int[] arr = {1, 2, 3, 45, 5};
//        swap(arr, 2, 4);
//        System.out.println("Array after swap "+Arrays.toString(arr));
        int max = maxVal(arr);
        System.out.println("Maximum value is: "+max);
        reverse(arr);
    }

    static void swap(int[] array, int index1, int index2)
    {
//        System.out.println("Array before swap "+Arrays.toString(array));
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static int maxVal(int[] array)
    {
        int max = array[0];
        for(int i = 1;  i < array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
//        System.out.println("Maximum value of the array is: "+max);
        return max;
    }

    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);
        while(end > start)
        {
            for(int i = start; i<=end; i++)
            {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
