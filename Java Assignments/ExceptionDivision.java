import java.util.Scanner;

public class ExceptionDivision {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter the dividend: ");
int d = sc.nextInt();

System.out.print("Enter the divisor: ");
int div = sc.nextInt();

try {
  int result = d/ div;
  System.out.println("Result: " + result);
} catch (Exception e) {
  System.out.println("Exception : " + e.getMessage());
}
}
}
