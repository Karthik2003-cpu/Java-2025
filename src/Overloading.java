public class Overloading {
    public void main(String[] args) {
            add(1,4);
            add(1,2,5);
    }

    static void add(int a, int b)
    {
        System.out.println("sum of a and b is "+(a+b));
    }

    static void add(int a, int b, int c)
    {
        System.out.println("sum of a, b and c is "+(a+b+c));
    }

}
