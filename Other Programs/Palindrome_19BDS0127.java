/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
/**
 *
 * @author HP
 */
public class Palindrome_19BDS0127 {
    public static void main(String[] args){
        System.out.println("enter the value of n :");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt( );
        int r,s=0;
        int t=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.println(s);
        
        if(t==s)
        {
            System.out.println("It is an palindrome");
        }
        else
        {
            System.out.println("It is not");
        }
    }
    
}
