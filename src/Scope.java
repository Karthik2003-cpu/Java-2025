public class Scope {
    String name = "Karthik";
    public static void main(String[] args) {
        Scope sp = new Scope();
        int a = 10;
        int b = 20;
        System.out.println("Value of String within function main is "+sp.name);
        System.out.println("value of a outside block is: " + a);
        {
            a = 30;
            System.out.println("Value of a within the block is: " + a);
            int c = 40;
            System.out.println("Value of C within the block is: " + c);
            System.out.println("Value of String within the block is "+sp.name);
        }
        System.out.println("value of a outside the block is: "+a+" which is after the block");
        System.out.println("value of c outside the block is not defined");

    }
}
