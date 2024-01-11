import java.util.Scanner;
abstract class Shape {
 abstract double RectangleArea(double l, double b);
 abstract double SquareArea(double s);
 abstract double CircleArea(double r);
}
class Area extends Shape {
 double RectangleArea(double l, double b) {
 return l * b;
 }
 double SquareArea(double s) {
 return s * s;
 }
 double CircleArea(double r) {
 return Math.PI * r * r;
 }
}
public class Question7 {
 public static void main(String[] args) {
 Area obj = new Area();
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Height of Rectangle: ");
 double h = sc.nextDouble();
 System.out.print("Enter Breadth of Rectangle: ");
 double b = sc.nextDouble();
 System.out.println("Area of Rectangle: " + obj.RectangleArea(h,b) + "\n");
 System.out.print("Enter Side of Square: ");
 double s = sc.nextDouble();
 System.out.println("Area of Square: " + obj.SquareArea(s) +"\n");
 System.out.print("Enter Radius of Circle: ");
 double r = sc.nextDouble();
 System.out.println("Area of Circle: " + obj.CircleArea(r) +"\n");
 sc.close();
 }
}