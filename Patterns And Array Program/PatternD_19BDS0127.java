package javalab2;
import java.util.Scanner;

public class PatternD_19BDS0127 {
    public static void main(String[] args){
        System.out.println(" Solved by Reg No. : 19BDS0127");
        System.out.println(" ---------");
        System.out.println("enter the value of n :");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt( );
        for( int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==2&&j==3)
                {
                    System.out.print(" ");
                }
                else if(i==3&&j==2)
                {
                    System.out.print(" ");
                }
                else if(i==3&&j==3)
                {
                    System.out.print(" ");
                }
                else if(i==3&&j==4)
                {
                    System.out.print(" ");
                }
                else if(i==4&&j==3)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
