package javalab2;
import java.util.Scanner;

public class Reverse_19BDS0127 {
    public static void main(String[] args){
        System.out.println(" Solved by Reg No. : 19BDS0127");
        System.out.println(" ---------");
        int i;
        System.out.println("enter the number of elements to be inserted :");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt( );
        int[ ] A= new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            A[i]=test.nextInt();
            
        }
        
        System.out.println("The Reverse order of the elements in the given array:");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    
    }
    
}