package studentInfo;

import java.util.Scanner;

public class studentInfo {

    public static void main(String[] args) {
        String studentFirstName = "Jennifer";
        char studentFirstInitial = studentFirstName.charAt(0);
        String studentMiddleName = "Alexandra";
        char studentMiddleInitial = studentMiddleName.charAt(0);
        String studentLastName = "Flores";
        char studentLastInitial = studentLastName.charAt(0);
        String studentID = "5994653";
        int studentAge = 22;
        double studentGPA = 3.92;
        boolean hasPerfectAttendance = true;

        System.out.println("Student Name: " + studentFirstName + " " + studentMiddleInitial + ". " + studentLastName);
        System.out.println("Student Initials: " + studentFirstInitial + studentMiddleInitial + studentLastInitial);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + studentAge);
        System.out.println("GPA: " + studentGPA);
        System.out.println("Perfect Attendance: " + hasPerfectAttendance);
        System.out.println("What do you want to update student GPA to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println("Student " + studentFirstName + " " + studentMiddleInitial + ". " + studentLastName + " now has a GPA of " + studentGPA);
        System.out.println("---------------------------------------------------"
        		+ "");   
        System.out.println("Student Name: " + studentFirstName + " " + studentMiddleInitial + ". " + studentLastName);
        System.out.println("Student Initials: " + studentFirstInitial + studentMiddleInitial + studentLastInitial);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + studentAge);
        System.out.println("GPA: " + studentGPA);
        System.out.println("Perfect Attendance: " + hasPerfectAttendance);
    }
}