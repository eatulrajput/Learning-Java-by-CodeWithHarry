// Author: Atul Rajput
// Date: 18th Feb, 2024
// Place: KP 19
// Problem Statement: WAP to calculate the percentage of a given student in CBSE board exam. His marks from subject 5 must be taken as input from the keyboard (Marks can out of 100 multiplied number subjects).
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        System.out.println("Hi, I am calculator and I will ask some questions from to calculate how much percentage you got in exam");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject 1 marks: ");
        int Sub1 = sc.nextInt();
        System.out.print("Enter subject 2 marks: ");
        int Sub2 = sc.nextInt();
        System.out.print("Enter subject 3 marks: ");
        int Sub3 = sc.nextInt();
        System.out.print("Enter subject 4 marks: ");
        int Sub4 = sc.nextInt();
        System.out.print("Enter subject 5 marks: ");
        int Sub5 = sc.nextInt();
        System.out.println("You got marks in 1st subject: " + Sub1);
        System.out.println("You got marks in 2nd subject: " + Sub2);
        System.out.println("You got marks in 3rd subject: " + Sub3);
        System.out.println("You got marks in 4th subject: " + Sub4);
        System.out.println("You got marks in 5th subject: " + Sub5);
        int Sum = Sub1 +Sub2 +Sub3 + Sub4 + Sub5;
        System.out.println("The sum of total marks you have gain is : " + Sum);
        System.out.print("What is the full marks of each subject: ");
        int fullMarksEachSubject = sc.nextInt();
        int totalMarks = fullMarksEachSubject * 5;
        System.out.println("Full marks per subject is : " + fullMarksEachSubject);
        System.out.println("Total Marks is: " + totalMarks);
        double percentage = (Sum * 100.00) / totalMarks;
        System.out.print("The percentage you have got in exam is: " + percentage);
        System.out.println(" %");
        }

    }
