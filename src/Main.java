public class Main {
    public static void print(String str){
        System.out.println("this is not static block: "+str);
    }
    public static void main(String [] args){

        //This is first program
        /*
            This is
            a multi line comment
         */

        System.out.print("I like pizza\n");
        System.out.println("It is really good!");
        Main m = new Main();
        m.print("Karthik");

        //variables

        int a=10,b=20;
        System.out.println(a+" "+b);


    }
}

