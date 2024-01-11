public class Que3 extends Thread {
public void run() {
}
public static void main(String[] args) {
Que3 t1 = new Que3();
System.out.println("Thread ID: " + t1.getId());
System.out.println("Thread Name: " + t1.getName());
System.out.println("Thread Priority: " + t1.getPriority());
System.out.println("Thread State: " + t1.getState());
}
}