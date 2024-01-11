public class Constructor {
    String name;

    // Default constructor
    public Constructor() {
        name = "WCE";
    }

    // Parameterized constructor
    public Constructor(String value) {
        name = value;
    }

    // Copy constructor
    public Constructor(Constructor other) {
        name = other.name;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("Sangli");
        Constructor obj3 = new Constructor(obj2);
        System.out.println("obj1.name = " + obj1.name);
        System.out.println("obj2.name = " + obj2.name);
        System.out.println("obj3.name = " + obj3.name);
    }
}
