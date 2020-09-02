/* Q1. Create a class called vacation with
Data members
(1) Place
(2) Date
(3) Activities [array of elements],
(4) Cost of each activity [array of elements]
Methods
(1) GetMethod
(2) PrintMethod
Inherit the data members and methods to a new class called
“SummerVacation” and include the data members
(1) CourseTitle
(2) OnlinePlatform [eg: nptel, courseera, udemey..]
(3) Duration
Methods
(1) GetMethod
(2) PrintMethod
(3) Calculate the total cost spent in vacation by creating static method
Define atleast two objects in main method and invoke the methods
defined in the class definition*/
package javalab4;
import java.util.*;
class Vacation
{
 String Place;
 String Date;
 String[] Activities;
 static int[] Cost;
 static int a;
 void GetMethod()
 {
  Scanner rv=new Scanner(System.in);
 System.out.print("Enter the place of vacation : ");
 Place=rv.next();
 System.out.print("Enter the date : ");
 Date=rv.next();
 System.out.print("Enter the no. of activities you  performed : ");
 a=rv.nextInt();
 Activities=new String[a];
 Cost=new int[a];
 for(int i=0;i<a;i++)
 {
 System.out.print("Enter activity No. "+(i+1)+" : ");
 Activities[i]=rv.next();
 System.out.print("Enter cost of the activity (in Rs) : ");
 Cost[i]=rv.nextInt();
 }
 }

 void PrintMethod()
 {
 System.out.println("Place: "+Place);
 System.out.println("Date: "+Date);
 System.out.println("Activities(including cost) : ");
 for(int i=0;i<a;i++)
 {
 System.out.println("Activity : "+Activities[i]);
 System.out.println(" Cost : "+Cost[i]);
 }
 }
}
class summer_vacation extends Vacation
{
 String CourseName;
 String OnlinePlatform;
 int Duration;
 static int CourseCost;
 void GetMethod()
 {
 super.GetMethod();
 System.out.print("Enter the course Name : ");
 Scanner rv=new Scanner(System.in);
 CourseName=rv.next();
 System.out.print("Enter the platform: ");
 OnlinePlatform=rv.next();
 System.out.print("Enter the duration (in weeks) : ");
 Duration=rv.nextInt();
 System.out.print("Enter the cost of course (in Rs) : ");
 CourseCost=rv.nextInt();
 }
 @Override
void PrintMethod()
 {
 super.PrintMethod();
 System.out.println("Course Title is "+CourseName);
 System.out.println("Online platform is "+OnlinePlatform);
 System.out.println("Duration of course is "+Duration);
 System.out.println("Cost of course is (in Rs) "+CourseCost);
 }
 static void totalcost()
 {
 int totalcost=0;
 for(int i=0;i<a;i++)
 {
 totalcost=totalcost+Cost[i];
 }
 totalcost=totalcost+CourseCost;
 System.out.println("Total amount spent in Vacation is (in Rs): "+totalcost);
 }
}



public class Summer_19BDS0127 {
    public static void main(String args[])
 {
 Vacation V1=new summer_vacation();
 V1.GetMethod();
 V1.PrintMethod();
 summer_vacation.totalcost();
 Vacation V2=new summer_vacation();
 V2.GetMethod();
 V2.PrintMethod();
 summer_vacation.totalcost();
 }
    
}
