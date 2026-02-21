import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        String name = "Karthik";
        char target = 'r';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
    }

    static int search(String item, char target)
    {
        int count = 0;
        for(int ch : item.toCharArray()) {
            count++;
            if (ch == target) {
                return count;
            }
        }
        return -1;
    }
}

