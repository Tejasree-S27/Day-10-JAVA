import java.util.*;
public class FibonaciiSeries3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=2;i<=10;i++)
        {
            int c=a+b;
            System.out.println(i+"->"+c);
            a=b;
            b=a;
        }
    }
}
