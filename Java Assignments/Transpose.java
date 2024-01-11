import java.util.*;
public class Transpose{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        i=sc.nextInt();
        System.out.print("Enter number of Columns : ");
        j=sc.nextInt();
        int [][] matrix=new int[i][j];
        for(int m=0;m<i;m++)
        {
            for(int n=0;n<j;n++)
            {
             matrix[m][n]=m+1;
            }
        }
        System.out.println("Original Matrix : ");
         for(int m=0;m<i;m++)
        {
            for(int n=0;n<j;n++)
            {
             System.out.print(" "+matrix[m][n]);
            }
            System.out.println();
        }

         int [][] Tmatrix=new int[j][i];
        for(int m=0;m<j;m++)
        {
            for(int n=0;n<i;n++)
            {
             Tmatrix[m][n]=matrix[n][m];
            }
        }
        System.out.println("Transpose Matrix : ");
        for(int m=0;m<j;m++)
        {
            for(int n=0;n<i;n++)
            {
             System.out.print(" "+Tmatrix[m][n]);
            }
            System.out.println();
        }

    }
}