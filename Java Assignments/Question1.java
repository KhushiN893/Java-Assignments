import java.util.*;
public class Question1 extends Thread {
public void run() {
System.out.println("In the run() method: " + Thread.currentThread().getName());
for (int i = 0; i < 5; i++) {
System.out.println("i: " + i);
try {
Thread.sleep(300);
} catch (InterruptedException ie) {
ie.printStackTrace();
}
}
}
public static void main(String[] args) {
Question1 t1 = new Question1();
Question1 t2 = new Question1();
t1.run();
t2.run();
}}