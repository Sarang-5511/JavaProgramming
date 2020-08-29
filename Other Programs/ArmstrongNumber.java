/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArmstrongNumber {
     public static void main(String[] args){
        System.out.println("enter the value of n :");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt( );
        int temp=n;
        
        
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        
        if(temp==sum)
        {
            System.out.println("It is an Armstrong Number");
           
        }
        else
        {
            System.out.println("it is not");
        }
     }
    
}
