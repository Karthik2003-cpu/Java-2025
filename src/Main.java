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

        System.out.println("this is local branch");

        double r;
        System.out.println("enter the radius of the circle: ");
        r = sc.nextDouble();
        System.out.println("circumference of the circle is: "+(2*Math.PI*r));
        System.out.println("area of circle is: "+(Math.PI*Math.pow(r,2)));
        System.out.println("volume of the circle is: "+((4.0/3.0)*Math.PI*Math.pow(r,3)));
        sc.close();
    }
}

