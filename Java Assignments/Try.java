import java.util.Scanner;

class STUDENT {
    int PRN, age;
    String name;
}

class UGSTUDENT extends STUDENT {
    int semester;
    double fees, stipend;
}

class PGSTUDENT extends STUDENT {
    int semester;
    double fees, stipend;
}

public class Try {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of UG students: ");
        n = sc.nextInt();
        UGSTUDENT[] ug = new UGSTUDENT[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for "+(i+1)+" : ");
            ug[i] = new UGSTUDENT();
            System.out.print("Enter PRN :" );
            ug[i].PRN = sc.nextInt();
            System.out.print("Enter name : " );
            ug[i].name = sc.next();
            System.out.print("Enter age : " );
            ug[i].age = sc.nextInt();
            System.out.print("Enter semester :");
            ug[i].semester = sc.nextInt();
            System.out.print("Enter fees : ");
            ug[i].fees = sc.nextDouble();
            System.out.print("Enter stipend : ");
            ug[i].stipend = sc.nextDouble();
            System.out.println("");
        }

        System.out.print("\nEnter the number of PG students: ");
        n = sc.nextInt();
        PGSTUDENT[] pg = new PGSTUDENT[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for "+(i+1)+" : ");
            pg[i] = new PGSTUDENT();
            System.out.print("Enter PRN :");
            pg[i].PRN = sc.nextInt();
            System.out.print("Enter name : ");
            pg[i].name = sc.next();
            System.out.print("Enter age : ");
            pg[i].age = sc.nextInt();
            System.out.print("Enter semester : ");
            pg[i].semester = sc.nextInt();
            System.out.print("Enter fees : ");
            pg[i].fees = sc.nextDouble();
            System.out.print("Enter stipend : ");
            pg[i].stipend = sc.nextDouble();
            System.out.println("");
        }

        double[] avgAgeUG = new double[8];
        int[] countUG = new int[8];
        for (int i = 0; i < ug.length; i++) {
            avgAgeUG[ug[i].semester] += ug[i].age;
            countUG[ug[i].semester]++;
        }

        System.out.println("\nSemester-wise average age of UG:");
        for (int i = 1; i <= 7; i++) {
            if (countUG[i] != 0) {
                           avgAgeUG[i] /= countUG[i];
            System.out.println("Semester " + i + ": " + avgAgeUG[i]);
        }
    }
    double[] avgAgePG = new double[8];
    int[] countPG = new int[8];
    for (int i = 0; i < pg.length; i++) {
        avgAgePG[pg[i].semester] += pg[i].age;
        countPG[pg[i].semester]++;
    }

    System.out.println("\nSemester-wise average age of PG :");
    for (int i = 1; i <= 7; i++) {
        if (countPG[i] != 0) {
            avgAgePG[i] /= countPG[i];
            System.out.println("Semester " + i + ": " + avgAgePG[i]);
        }
    }

}
}