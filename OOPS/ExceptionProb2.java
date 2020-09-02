/*Create a user defined exception class by extending exception class to
handle two kind of scenario, where
(1) input cannot be negative
(2) input cannot be in the range 0 to 25
Throw object of user defined exception class and handle it by using
nested try block with specific exceptions catch block. Also define finally
block in the program*/
package javalab6;
import java.util.*;
public class UserDefinedException_19BDS0127 extends Exception{
    public int n;
    public UserDefinedException_19BDS0127(){
       
        System.out.println("Input is less than 0(Not accepted) ");
    }
    public UserDefinedException_19BDS0127(int x,int y){
        System.out.println("Input cannot be in the range "+ x + " and "+ y);
    }
    public static void main(String [] args){
        Scanner test=new Scanner(System.in);
        int i=1;
        while(i==1)
        try{
            int counter=-1;
            System.out.println("Enter the input :");
            int n=test.nextInt();
            System.out.println("Enter the range of the numbers:");
            int x=test.nextInt();
            int y=test.nextInt();
            try{
                if(n<0)
                   throw new UserDefinedException_19BDS0127( );
           }
            catch(UserDefinedException_19BDS0127 e){
                System.out.println("Exception in nested block");
                counter=1;
            }
            if(n>=0&& n<=25){
                
                throw new UserDefinedException_19BDS0127(0,25);
                
            }
            if(counter!=1){
                System.out.println(n+" is valid");
            }
            }
        catch(UserDefinedException_19BDS0127 e){
            System.out.println("Exception outside nested block");
        }
        
            
        catch(Exception e){
            System.out.println("Parent Exception");
        }
    
        finally{
            System.out.println("******");
            System.out.println("Enter 1 to continue /0 to exit");
             i=test.nextInt();
             if(i==0){
                 System.exit(0);
             }
        }
     }
 }
    
    

