import java.util.*;
public class Search {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Element["+(i+1)+"] : ");
            array[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]==10){
            System.out.println("10 is present in array at location "+(i+1)+" !");
            cnt++;
            }
        }
        if(cnt==0)
        System.out.print("10 is not present in arrray");
    }
}