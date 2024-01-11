import java.util.Scanner;

public class Sphere {
    public static void calculateArea(double radius) {
        System.out.println("Area of the sphere: " + 4 * 3.14 * radius * radius);
    }

    public static void calculateVolume(double radius) {
        System.out.println("Volume of the sphere: " + 4 / 3 * 3.14 * radius * radius * radius);
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        calculateArea(radius);
        calculateVolume(radius);

        }
}
