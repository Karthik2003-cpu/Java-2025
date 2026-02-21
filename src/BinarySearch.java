public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {4, 5, 36, 22, 1, 78};
        int key = 78;
        System.out.println(binarySearch(arr, key));
    }
    static int binarySearch(int[] array, int key)
    {
        System.out.println("Initiating the search");
        int low = 0, high = array.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            System.out.println("entered the loop");
            if(array[mid] == key)
            {
                System.out.println("entered if statement");
                return mid+1;
            }
            else if(key > array[mid])
            {
                System.out.println("entered else if");
                low = mid + 1;
            }
            else {
                System.out.println("entered else block");
                high = mid - 1;
            }
        }
        return -1;
    }
}
