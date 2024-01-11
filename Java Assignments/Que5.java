class Call {
boolean CallConnected;
public Call() {
CallConnected = true;
}
synchronized void Connect() {
System.out.println("Trying to Connect");
if (CallConnected) {
System.out.println("Phone Engaged... Waiting to Disconnect");
try {
wait();
} catch (Exception e) {
}
}
System.out.println("Call Connected!");
}
synchronized void Disonnect() {
System.out.println("Trying to Disconnect");
System.out.println("Call Disconnected! ");
notify();
}
}
public class Que5 {
public static void main(String args[]) {
final Call c1 = new Call();
new Thread() {
public void run() {
c1.Connect();
}
}.start();
new Thread() {
public void run() {
c1.Disonnect();
}
}.start();
}
}