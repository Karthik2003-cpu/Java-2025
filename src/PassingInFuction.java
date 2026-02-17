import java.util.Arrays;

public class PassingInFuction {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};  //This is the array object
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) /*This array object is pointing to the same array object nums
                                    that is why arr changes the original object*/
    {
        arr[3] = 45;
    }
}

