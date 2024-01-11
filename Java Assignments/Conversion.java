import java.util.Scanner;
public class Conversion {
  public int hours,minutes,remainingSeconds,seconds;
  public void convert()
  {
    hours = seconds / 3600;
    minutes = (seconds % 3600) / 60;
    remainingSeconds = seconds % 60;
    System.out.println("Hours : "+ hours+ "\n" + "Minutes : " +minutes + "\n" + "Seconds : "+ remainingSeconds );
  }

    public static void main(String[] args) {
        Conversion time=new Conversion();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        time.seconds = scanner.nextInt();  
        time.convert();    
       
    }
}





