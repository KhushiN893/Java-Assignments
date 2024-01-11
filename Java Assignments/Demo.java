
class Base {
    private int num;
    
    public Base(int num) {
        this.num = num;
    }
    
    public int getNum() {
        return num;
    }
}
class Derived1 extends Base {
    protected int square;
    
    public Derived1(int num) {
        super(num);
        square = num * num;
    }
    
    protected int getSquare() {
        return square;
    }
}

class Derived2 extends Base {
    public int cube;
    
    public Derived2(int num) {
        super(num);
        cube = num * num * num;
    }
    
    public int getCube() {
        return cube;
    }
}
class Hybrid extends Derived1 {
    public Hybrid(int num) {
        super(num);
    }
    
    public void display() {
        System.out.println("Number: " + getNum());
        System.out.println("Square: " + getSquare());
        Derived2 d2 = new Derived2(getNum());
        System.out.println("Cube: " + d2.getCube());
    }
}

public class Demo {
    public static void main(String[] args) {
        Hybrid h = new Hybrid(9);
        h.display();
    }
}