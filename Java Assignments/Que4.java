public class Que4 extends Thread {
public void run() {
System.out.println("Thread Using Thread Class");
}
public static void main(String[] args) {
Que4 t1 = new Que4();
ThreadInterface t2 = new ThreadInterface();
t1.start();
Thread thread = new Thread(t2);
thread.start();
}
}
class ThreadInterface implements Runnable {
@Override
public void run() {
System.out.println("Thread Using Runnable Interface");
}
}