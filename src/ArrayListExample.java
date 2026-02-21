import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(23);
//        list.add(22);
//        list.add(24);
//        list.add(25);
//        list.add(26);
//
//        System.out.println(list);
//        list.set(1, 45);
//
//        System.out.println(list);
        System.out.println("Enter the array list values: ");
        for(int i = 0; i< 5; i++)
        {
            list.add(in.nextInt());
        }

//        for(int i = 0; i< list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }

        System.out.println(list.size());
          System.out.println(list);

        in.close();
    }
}
