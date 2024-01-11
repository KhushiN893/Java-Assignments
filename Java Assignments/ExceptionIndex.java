import java.util.Scanner;
public class ExceptionIndex{
    public static void main(String args[]){
        int[] arr = {10,30,70,90,22};
        int index;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Index (starts from 0): ");
        index=sc.nextInt();
     try {
      System.out.println("Element at " +index+" : "+ arr[index]);
     } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Exception :"+e);
     }
    }
}
