interface College {
    String clgName = "Walchand College";
}

class Teacher {
    String name, qualification;
    Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
}

class Department extends Teacher {
    String deptNo, deptName;
    Department(String name, String qualification, String deptNo, String deptName) {
        super(name, qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Department dt = new Department("A.B.Sonawane", "Ph.D", "101", "Information Technology");
        System.out.println("College Name: " + College.clgName);
        System.out.println("Teacher Name: " + dt.name);
        System.out.println("Teacher Qualification: " + dt.qualification);
        System.out.println("Department No: " + dt.deptNo);
        System.out.println("Department Name: " + dt.deptName);
    }
}