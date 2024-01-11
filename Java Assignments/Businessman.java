class Person {
    public void walk() {
        System.out.println("I can Walk");
    }
    
    public void talk() {
        System.out.println("I can Talk");
    }
    
    public void eat() {
        System.out.println("I can Eat");
    }
    
    public void sleep() {
        System.out.println("I can Sleep");
    }
}

class MathsTeacher extends Person {
    public MathsTeacher(){
    System.out.println("I am MathsTeacher");
    }
    public void teachMaths() {
        System.out.println("I can teach math");
    }
}

class Footballer extends Person {
    public Footballer(){
    System.out.println("I am Footballer");
    }
    public void playFootball() {
        System.out.println("I can play football");
    }
}

public class Businessman extends Person {
    public Businessman(){
    System.out.println("I am BusinessMan");
    }
    public void runBusiness() {
        System.out.println("I can run Business");
    }
    public static void main(String[] args) {
    MathsTeacher mathsTeacher = new MathsTeacher();
    mathsTeacher.walk();
    mathsTeacher.talk();
    mathsTeacher.eat();
    mathsTeacher.sleep();
    mathsTeacher.teachMaths();
    System.out.println("");
    Footballer footballer = new Footballer();
    footballer.walk();
    footballer.talk();
    footballer.eat();
    footballer.sleep();
    footballer.playFootball();
    System.out.println("");
    Businessman businessman = new Businessman();
    businessman.walk();
    businessman.talk();
    businessman.eat();
    businessman.sleep();
    businessman.runBusiness();
}
}