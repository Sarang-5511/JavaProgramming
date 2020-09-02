/*Create a program to take input from user as 1 /2 /3, if user enters 1,
display info about Arithmetic Exception, 2 and 3 for Null pointer
exception and Array index out of bound exception, respectively. Use, Try,
Catch block for each exception individually.*/

package javalab6;
import java.util.*;
public class Exception_19BDS0127 {
   public static void main(String[] args) {
       Scanner choice=new Scanner(System.in);
       System.out.print("Enter your Choice(1-3):");
      int n=choice.nextInt();
      switch(n){
          case 1:
              try{
                  int i=10/0;
                  System.out.println(i);
              }
              catch(ArithmeticException e){
                  System.out.println("Error is :");
                  System.out.println(e);
              }
          break;
          case 2:
              try{
                  String s=null;
                  System.out.println(s.length());
                  
              }
              catch(NullPointerException e){
                  System.out.println("Error is :");
                  System.out.println(e);
              }
              break;
              case 3:
              try{
                  int []A=new int[5];
                  A[10]=20;
                  
              }
              catch(ArrayIndexOutOfBoundsException  e){
                  System.out.println("Error is :");
                  System.out.println(e);
              }
              break;
              default:
                  System.out.println("Wrong Choice!");
                  break;
      }
    }
}
