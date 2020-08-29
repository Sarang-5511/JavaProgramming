package javaapplication3;
import java.util.*;
/**
 *
 * @author HP
 */
public class Fibonnaci_19BDS0127 {
    public static void main(String [] args)
    {
        System.out.println("enter the value of n:");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt();
        int a,b=0,c=1;
        System.out.println("the fiboonacci Series is :");
        System.out.print("0 1 " );
        
        for(int i=0;i<=n-2;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print( c+" ");
        }
    }
}
