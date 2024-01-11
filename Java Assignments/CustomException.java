import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String d = sc.next();
        try {
            int num = Integer.parseInt(d);
            if (num < 0) {
                throw new InvalidInputException("Number must be non-negative.");
            }
            System.out.println("Number: " + num);
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: ");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: ");
        } catch (Exception e) {
            System.out.println("Caught Exception: ");
        }
    }
}
