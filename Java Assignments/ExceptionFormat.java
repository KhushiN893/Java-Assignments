
import java.util.Scanner;

public class ExceptionFormat{
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number : ");
String d = sc.next();
try {
    int num = Integer.parseInt(d); 
    System.out.println("The number is: " + num);
} catch (NumberFormatException e) {
    System.out.println("Invalid Input");
}
}
}
