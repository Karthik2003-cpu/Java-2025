public class Checking {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++)
        {
            if(isArmstring(i))
            {
                System.out.println(i+" ");
            }
        }
    }

    static boolean isArmstring(int num)
    {
        int sum = 0;
        int original = num;
        while(num>0)
        {
            int rem = num % 10;
            num/= 10;
            sum+= rem*rem*rem;
        }
        return original == sum;
    }
}
