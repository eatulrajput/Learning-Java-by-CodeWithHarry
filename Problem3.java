// Author: Atul Rajput
// Date: 17th Feb, 2024
// Place: KP19
//Problem Statement: WAP to calculate CGPA of 3 subjects whose marks are given.
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
    System.out.println("Hi, I am CGPA calculator");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks of the first subject: ");
    double subject1Marks = sc.nextInt();
    System.out.print("Enter marks of the second subject: ");
    double subject2Marks = sc.nextInt();
    System.out.print("Enter marks of the third subject: ");
    double subject3Marks = sc.nextInt();

    // Assuming a standard scale of 10 for grades
    int maxMarksPerSubject = 100;
    double scale = 10.0;

    // Calculating CGPA
    double cgpa;
    cgpa = (subject1Marks / maxMarksPerSubject + subject2Marks / maxMarksPerSubject + subject3Marks / maxMarksPerSubject) / 3 * scale;

    // Displaying CGPA
        System.out.println("CGPA: " + cgpa);
    }

}

