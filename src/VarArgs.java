import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        varArgs(1, 4, "Karthik", "Koushik");
        demo(1, 2, 34,5, 6);  //method overloading for varargs function
        demo("asdf", "asdfasdfa", "asdfsadf", "asdfasdf", "asdfasdf");
    }
    static void varArgs(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(v);
        System.out.println(a+" "+b);
    }

    static void demo(int ...g)
    {
        System.out.println(Arrays.toString(g));
    }

    static void demo(String ...g)
    {
        System.out.println(Arrays.toString(g));
    }
}
