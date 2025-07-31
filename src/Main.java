import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("ENTER STUDENT INFORMATION");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine(); 
        
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine(); 
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine(); 
        
        System.out.print("Enter Course: ");
        String course = scanner.nextLine(); 
        
        System.out.print("Enter Section: ");
        String section = scanner.nextLine(); 
        
         System.out.println("\nSTUDENT INFORMATION");
         System.out.println("Student ID: " + studentId);
         System.out.println("First Name: " + firstName);
         System.out.println("Last Name: " + lastName);
         System.out.println("Course: " + course);
         System.out.println("Section: " + section);
         
        
        System.out.print("\nEnter Midterm Exam Score: ");
        int midtermExam = scanner.nextInt(); 
        
        System.out.print("Enter Final Exam Score: ");
        int finalExam = scanner.nextInt(); 
        
        System.out.print("Enter Project Score: ");
        int project = scanner.nextInt(); 
        
        System.out.print("Enter Attendance Score: ");
        int attendance = scanner.nextInt(); 
        
        int total = midtermExam + finalExam + project + attendance;
        int avarage = total / 4;
        
        String remarks; 
        if( avarage < 75){
            remarks = "FAILED";
        }else {
            remarks = "PASSED";
        }
        
         System.out.println("\nSTUDENT SCORE");
         System.out.println("MidTerm Score: " + midtermExam);
         System.out.println("Final Score: " + finalExam);
         System.out.println("Project: " + project);
         System.out.println("Attendance: " + attendance);
         System.out.println("---------------");
         System.out.println("Avarage: " + avarage);
         System.out.println("Remarks: " + remarks);
         
         scanner.close();
    }
}
