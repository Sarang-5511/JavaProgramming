/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab2;
import java.util.*;
/**
 *
 * @author HP
 */
public class PatternC_19BDS0127 {
    
    public static void main(String args [])
    {
        System.out.println("14th July,2020.\n@author Saurabh Agrawal.");
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=in.nextInt();
        int c=-1,cc=0;
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int sp1=1;sp1<=c;sp1++)
            {
                System.out.print(" ");
                cc=1;
            }
            if(cc==1)
            {
                System.out.print("*");
                cc=0;
            }
            c+=2;
            System.out.println(" ");
        }
        int c1=c-4;
        for(int j=n;j>1;j--)
        {
            for(int sp2=1;sp2<=n-j+1;sp2++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int sp3=1;sp3<=c1;sp3++)
            {
                System.out.print(" ");
                cc=1;
            }
            c1-=2;
            if(cc==1)
            {
                System.out.print("*");
                cc=0;
            }
            System.out.println(" ");
        }
    }
}
 