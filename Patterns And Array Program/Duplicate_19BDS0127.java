
package javalab2;

import java.util.Scanner;


public class Duplicate_19BDS0127 {
    public static void main (String[] args){
        int i,temp;
        System.out.println("enter the number of elements to be inserted :");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt( );
        int[ ] A= new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            A[i]=test.nextInt();
         }
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]>A[j])
                {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("The sorted order in ascending order :");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(A[i]==A[i+1])
            {
                System.out.println("the removed element is :"+ A[i+1]);
            }
        }
        System.out.println("The order after removing duplicate is :");
        for(i=0;i<n-1;i++)
        {
            System.out.print(A[i]+" ");
        }
     }
    
}
