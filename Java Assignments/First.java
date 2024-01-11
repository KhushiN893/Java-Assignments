import java.util.*;
public class First{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int prn;
        String name;
        float marks;
        System.out.print("Enter PRN :");
        prn=sc.nextInt();
        System.out.print("Enter Name :");
        name=sc.next();
        System.out.print("Enter Marks :");
        marks=sc.nextFloat();
        System.out.println("");
        System.out.println("PRN :"+prn);
        System.out.println("Name:"+name);
        System.out.println("Marks :"+marks);
    }
}