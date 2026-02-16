public class Shadow {
    static int x = 90;//higher level scope variable is shadowed at line 6
    public static void main(String[] args){
        System.out.println(x);
        int x; //this valriable shadowed the class varibale at line 3
        //System.out.println(x); //Scope will begin after variable is declared
        x = 50;
        System.out.println(x);
        func(x);
    }

    static void func(int x){
        System.out.println(x);
    }
}
