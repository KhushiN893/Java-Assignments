
// 5.	Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

class Shape {
    public void print() {
        System.out.println("This is shape.");
    }
}

class Rectangle extends Shape {
    public void print() {
        System.out.println("This is rectangular shape.");
        super.print();
    }
}

class Circle extends Shape {
    public void print() {
        System.out.println("This is circular shape.");
    }
}

public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle.");    
    }
     public static void main(String[] args) {
        Square square = new Square();
        square.print();
    }
}
