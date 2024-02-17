// Author: Atul Rajput
// Date: 17th Feb, 2024
// Place: KP19
// Problem Statement: WAP to get the of three number.
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is the program to find the sum of three integers");
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
        System.out.println("The third number is: " + num3);
        System.out.println("The sum of three numbers is " + sum);
    }
}
