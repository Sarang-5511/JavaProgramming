package javalab3;
import java.util.Scanner;

public class Addofmatrices_19BDS0127 {
    public static void main(String[] args) {
        System.out.println(" Solved by Reg No. : 19BDS0127");
        System.out.println(" ---------");
        int i,j;
        Scanner test=new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix A:");
        int m=test.nextInt();
        System.out.println("Enter the number of columns in the matrix A:");
        int n=test.nextInt();
        int [][] A= new int[n][m];
        int [][] B= new int[n][m];
        int [][] C= new int[n][m];
        System.out.println("Enter the Matrix A:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=test.nextInt( );
            }
        }
        System.out.println("Enter the number of rows in the matrix B:");
         m=test.nextInt();
        System.out.println("Enter the number of columns in the matrix B:");
         n=test.nextInt();
        System.out.println("Enter the Matrix B:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                B[i][j]=test.nextInt( );
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("The sum of the matrix A and B is  Matrix C:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}