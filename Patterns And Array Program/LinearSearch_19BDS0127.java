package javalab2;
import java.util.Scanner;

public class LinearSearch_19BDS0127 {
    public static void main(String[] args){
        System.out.println(" Solved by Reg No. : 19BDS0127");
        System.out.println(" ---------");
        int i;
        System.out.println("enter the number of elements  to be inserted:");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt( );
        System.out.println("Enter the elements :");
        int[ ] A= new int[n] ;
        for(i=0;i<n;i++)
        {
             A[i]=test.nextInt();
        }
        System.out.println("enter the key to be searched :");
        int key=test.nextInt();
        for( i=0;i<n;i++)
        {
            if(A[i]==key)
            {
                System.out.printf("%d found at location %d ",key,i+1);
                break;
            }
        }
        if(i==n)
        {
            System.out.print("key not found");
        }
        System.out.println(" ");
    }
}
