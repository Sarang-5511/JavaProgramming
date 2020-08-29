package javalab3;
import java.util.*;
public class IdentityMatrix_19BS0127 {
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
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(A[0][0]==1 && A[1][1]==1 && A[2][2]==1 )
                {
                    if(i!=j && A[i][j]==0)
                    {
                        System.out.println("It is an identity matirx");
                        break;
                    }
                }
                else{
                        System.out.println("It is not an identity matrix");
                        break;
                    }
            }
            break;
        }
    }
}
