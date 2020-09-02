/*Design a class called Participants with properties like Name, Phno,
Branch and University, TestResult_Classification[L1,L2,L3,L4,L5]. Create a
static method to display a message as follows based on the selection
criteria,
(i) If student test result classification is L1, congratulate the student
and inform that he/she has been selected for both Full time
intership as well as Full time job
(ii) If student test result classification is L2 or L3, inform the student
that he/she has been selected for Full time intership and Job
may be offered based on intership Performance.
(iii) If student test result classification is L4 or L5, inform that he/she
has been selected for Part time intership of 21 days.
Create atleast three Participants objects of array and then invoke static
method to display the message.
Note: Don’t use if statement for conditional check, instead use Switch
Case statement.*/
package javalab4;
import java.util.*;
class Participants{
    static String Name;
    static long Phno;
    static String Branch;
    static String University;
    static String Test_result;
    
    void GetValue(){
        Scanner test=new Scanner(System.in);
        System.out.println("Name: ");
        Name=test.nextLine();
        System.out.println("Phno: ");
        Phno=test.nextLong();
        System.out.println("Branch: ");
        Branch=test.next();
        System.out.println("University:");
        University=test.next();
        System.out.println("Test_result:");
        Test_result=test.next();
    }
    static void Result(Participants n){
        System.out.println("Result is:");
        switch(Test_result)
        {
             case "L1":
                System.out.println("Dear "+Name+", Congratulations. You have been selected for both Full time internship as well as Full time job.");
                break;
            case "L2":
            case "L3":
                System.out.println("Dear "+Name+", Congratulations. You have been selected for Full time internship and Job may be offered based on internship Performance.");
                break;
            case "L4":
            case "L5":
                System.out.println("Dear "+Name+", Congratulations. You have been selected for Part time internship of 21 days.");
                break;
            default:
                System.out.println("Invalid Entry.");
        }
    }
}
public class ProblemA_19BDS0127 {
    public static void main(String[] args){
        System.out.println("Enter the no of Participant:");
        Scanner test=new Scanner(System.in);
        int n=test.nextInt();
        
        Participants PART[]=new Participants[n];
        for(int i=0;i<n;i++)
        {
            PART[i]=new Participants();
            PART[i].GetValue();
           Participants.Result(PART[i]);
        }
    }
}
