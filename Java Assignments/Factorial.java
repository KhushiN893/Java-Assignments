public class Factorial{
    public static void main(String args[])
    {
        int fact=Integer.parseInt(args[0]);
        int result=1;
        for(int i=1;i<=fact;i++)
        result=result*i;
        System.out.println("Factorial of "+fact+" is "+result);
    }
}