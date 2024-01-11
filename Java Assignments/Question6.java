abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is the constructor of abstract class");
    }
    
    abstract void a_method();
    
    void normal_method() {
        System.out.println("This is a normal method");
    }
}

class SubClass extends AbstractClass {
    void a_method() {
        System.out.println("This is the abstract method");
    }
}

public class Question6 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.a_method();
        subClass.normal_method();
    }
}
