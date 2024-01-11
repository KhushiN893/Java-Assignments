// InheritanceEx2Main.java
public class InheritanceEx2Main {
    public static void main(String[] args) {
        Allowance emp = new Allowance("Engineering", 101, "Saee", 1000.90);
        
        System.out.println("Department: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Allowance Amount: " + emp.getAllowanceAmount());
    }
}

// Department.java
class Department {
    protected String name;    
    public Department(String name) {
        this.name = name;
    }    
    public String getName() {
        return name;
    }
}
// Employee.java
class Employee extends Department {
    protected int employeeId;  
    protected String empName;  
    public Employee(String name, int employeeId,String empName) {
        super(name);
        this.employeeId = employeeId;
        this.empName = empName;
    }    
    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmpName()
    {
        return empName;
    }
}

// Allowance.java
class Allowance extends Employee {
    private double allowanceAmount;
    
    public Allowance(String name,int employeeId,String empName, double allowanceAmount) {
        super(name, employeeId,empName);
        this.allowanceAmount = allowanceAmount;
    }    
    public double getAllowanceAmount() {
        return allowanceAmount;
    }
}

