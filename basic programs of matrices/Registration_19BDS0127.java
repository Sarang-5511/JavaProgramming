package javalab3;
import java.util.*;
 class Student{
    String Regno;
    String Name;

  void GetMethod(){
        Scanner scan=new Scanner (System.in);
        System.out.print("Reg No.:");
        Regno=scan.nextLine();
        System.out.print("Name:");
        Name=scan.nextLine();
  }
  void PrintMethod(){
      System.out.println("The Regno is:"+Regno);
      System.out.println("The Name is:"+Name);
  }
}       
class Courses{
    String CourseCode;
    String slot;
    String venue;
    void GetMethod(){
        Scanner scan=new Scanner (System.in);
        System.out.print("CourseCode:");
        CourseCode=scan.nextLine();
        System.out.print("Slot:");
        slot=scan.nextLine();
        System.out.print("Venue:");
        venue=scan.nextLine();
  }
  void PrintMethod(){
      System.out.println("The course codeis:"+CourseCode);
      System.out.println("The Slot is:"+slot);
      System.out.println("The venue is:"+venue);
  }
}       
    
public class Registration_19BDS0127 {
    
    public static void main(String[] args){
    System.out.println(" Solved by Reg No. : 19BDS0127");
    System.out.println(" ---------");
    Student Ram= new Student();
    Courses Math =new Courses();
    Ram.GetMethod();
    Math.GetMethod();
    System.out.println("****");
    Student Ravi= new Student();
    Courses Phy =new Courses();
    Ravi.GetMethod();
    Phy.GetMethod();
    System.out.println("****");
    Student Darshan= new Student();
    Courses Chem =new Courses();
    Darshan.GetMethod();
    Chem.GetMethod();
    System.out.println(" ");
    System.out.println("STUDENTS DETAILS: ");
    System.out.println(" ");
    Ram.PrintMethod();
    Math.PrintMethod();
    System.out.println("------");
    Ravi.PrintMethod();
    Phy.PrintMethod();
    System.out.println("----");
    Darshan.PrintMethod();
    Chem.PrintMethod();
    System.out.println(" ");
    
    
    
   }
}
