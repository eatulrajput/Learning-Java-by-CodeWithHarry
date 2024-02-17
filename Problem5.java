// Author: Atul Rajput
// Date: 17th Feb, 2024
// Place: KP19
// WAP to convert kilometre to mile
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hey, I am a distance converter, I convert kilometre to mile!");
    System.out.print("Enter the distance in kilometre: ");
    double distanceInKilometre = sc.nextDouble();
    System.out.print("The distance in kilometre is " + distanceInKilometre);
    System.out.println(" km");
    // Since 1 mile equals to 1.60934 km
    double mile = distanceInKilometre / 1.60934;
    System.out.print("The distance in mile is " + mile);
    System.out.print(" mile");
    }
}
