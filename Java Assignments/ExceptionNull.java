
import java.util.Scanner;
public class ExceptionNull{
    public static void main(String args[]){
        try {
    String str = null;
    str.toUpperCase();
} catch (NullPointerException e) {
    System.out.println("Caught NullPointerException: " + e.getMessage());
}
    }
}
