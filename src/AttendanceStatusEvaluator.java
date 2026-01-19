import java.util.*;
import java.util.Scanner;
 class AttendanceStatusEvaluator{
public static void main(Strings[]args)

    
    Scanner sc = new Scanner(System.in);
    int Attendance=sc.nextInt();
    if(Attendance>85){
      System.out.println("Excellent");
  }
    else if(Attendance>=60 && Attendance<=85){
      System.out.println("Satisfactory");
    }
    else{
      System.out.println("Poor");
    }
}


  
