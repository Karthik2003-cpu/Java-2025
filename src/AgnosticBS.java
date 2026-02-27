public class AgnosticBS {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6,7,8};
        int[] b = {55,53,51, 47, 44, 39, 28, 17, 5};
        int target = 51;
        System.out.println(agnosticBS(b, target));
    }

    static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (!(start > end)) {
            int mid = (start + (end - start) / 2);
            if (target == arr[mid]) {
                return mid+1;
            }
            if (isAsc) {
                if (target < arr[mid]) {  //remember to use arr[mid] not mid
                    end = mid - 1;        //because we comparing against mid element, not index
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
