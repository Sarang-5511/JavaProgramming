package javalab3;
import java.util.Scanner;

public class Sumofrows_19BDS0127 {
    public static void main(String[] args) {
        System.out.println(" Solved by Reg No. : 19BDS0127");
        System.out.println(" ---------");
        int i,j;
        Scanner test=new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix:");
        int m=test.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int n=test.nextInt();
        int [][] A= new int[n][m];
        System.out.println("Enter the Matrix A:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=test.nextInt( );
            }
        }
       System.out.println("Sum of rows of the given matrix :");
        for(i=0;i<m;i++)
        {
            int sum=0;
            for(j=0;j<n;j++)
            {
                sum=sum+A[i][j];
            }
            System.out.println(sum);
            System.out.println(" ");
        }
    }
}
