package javalab2;

import java.util.Scanner;


public class PatternA_19BDS0127 {

    
    public static void main(String[] args) {
        System.out.println(" Solved by Reg No. : 19BDS0127");
        System.out.println(" ---------");
        System.out.println("enter the value of n :");
        Scanner test= new Scanner(System.in);
        int n=test.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int st=1;st<=i+1;st++)
            {
                System.out.print("*");
            }
            for(int sp=1;sp<=n-i-1;sp++)
            {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    
}
