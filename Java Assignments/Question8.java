import java.util.Scanner;
import useful.*;
public class Question8{
 public static void main(String[] args) {
 Useme obj = new Useme();
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Length of Rectangle: ");
 double l = sc.nextDouble();
 System.out.print("Enter Width of Rectangle: ");
 double w = sc.nextDouble();
 System.out.println("Area of Rectangle: " +
obj.areaOfRectangle(l, w) + "\n");
 System.out.print("Enter Percentage: ");
 double percent = sc.nextDouble();
 System.out.print("Enter Of: ");
 double of = sc.nextDouble();
 System.out.println("Result: " + obj.percentage(percent, of) +
"\n");
 }
}