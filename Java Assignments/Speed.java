import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;
public class Speed {
 public static void main(String[] args) {
 final int max_speed = 100;
 while (true) {
 int current_speed = new Random().nextInt(101 - 97) + 97;
 System.out.println("Current Speed: " + current_speed);
 if (current_speed == max_speed ) {
 showMessageDialog(null, "Maximum Speed Reached!");
 break;
 }
 }
 }
}
