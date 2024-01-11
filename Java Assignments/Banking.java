abstract class Bank {
 abstract int getBalance();
}
class A extends Bank {
 private int balance = 500;
 public int getBalance() {
 return balance;
 }
}
class B extends Bank {
 private int balance = 150;
 public int getBalance() {
 return balance;
 }
}
class C extends Bank {
 private int balance = 250;
 public int getBalance() {
 return balance;
 }
}
public class Banking {
 public static void main(String[] args) {
 A a = new A();
 B b = new B();
 C c = new C();
 System.out.println("A balance: $" + a.getBalance());
 System.out.println("B balance: $" + b.getBalance());
 System.out.println("C balance: $" + c.getBalance());
 }
}
