import java.util.Scanner;
public class Main {
    public static void main(String [] args){

         Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//        Random class to create random objects
//        boolean coin;
//        coin = rd.nextBoolean();
//        if(coin){
//            System.out.println("HEADS");
//        }
//        else{
//            System.out.println("TAILS");
//        }
//        System.out.println(Math.min(31, 45));
//          int a,b;
//          double c;
//        System.out.println("Enter the value of side A: ");
//        a = sc.nextInt();
//        System.out.println("Enter the value of side B: ");
//        b = sc.nextInt();
//        c = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
//        System.out.println("the hypotenuse of triangle with side A and B is "+c);

//        System.out.println("this is local branch");
//
//        double r;
//        System.out.println("enter the radius of the circle: ");
//        r = sc.nextDouble();
//        System.out.println("circumference of the circle is: "+(2*Math.PI*r));
//        System.out.println("area of circle is: "+(Math.PI*Math.pow(r,2)));
//        System.out.println("volume of the circle is: "+((4.0/3.0)*Math.PI*Math.pow(r,3)));
//        sc.close();

//        int a = (int)(45.76f);
//        System.out.println(a);

//        byte a = 50;
//        a = a * 50;

//        int flag = 1;
//        while(flag == 1) {
//            System.out.print("Enter your name");
//            String a =  sc.next();
//            switch (a) {
//                case "Karthik" -> System.out.println("--> Yelder son");
//                case "Koushik" -> System.out.println(" --> Younger song");
//                case "Raghavendra" -> System.out.println("--> Father of HOme");
//                case "Rashmi" -> System.out.println("--> Mother of Home");
//                case "Ajji" -> System.out.println("--> Grandmother of Home");
//                default -> System.out.println("--> Main father of Home");
//            }
//            System.out.println("Enter 1 to continue | 0 to exit");
//            flag = sc.nextInt();
//        }
        int a, b;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("Before swap a is "+a+" b is "+b);
        swapTwo(a,b);
        sc.close();

    }
    static void swapTwo(int x, int y)
    {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swap a is "+x+" b is "+y);
    }
}


