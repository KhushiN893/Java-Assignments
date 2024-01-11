
 import java.util.*;

 public class Que2 extends Thread {
 DemoClass obj;

 public Que2(DemoClass obj) {
 this.obj = obj;
 }

 public void run() {
 synchronized (obj) {
 obj.printFunction();
 }
 }

 public static void main(String[] args) {
 DemoClass obj = new DemoClass();
 Que2 t1 = new Que2(obj);
 Que2 t2 = new Que2(obj);
 t1.start();
 t2.start();
 }
 }

 class DemoClass {
 public void printFunction() {
 System.out.println("Thread started");
 try {
 Thread.sleep(1000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 System.out.println("Thread Ended");
 }}