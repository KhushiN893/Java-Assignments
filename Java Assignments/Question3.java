public class Question3 {
 public static void main(String[] args) {
 InnerNonStatic obj1 = new Question3().new InnerNonStatic();
 InnerStatic obj2 = new InnerStatic();
 obj2.access();
 }
 class InnerNonStatic {
 InnerNonStatic() {
 System.out.println("Name: " + new OuterClass().name);
 System.out.println("Age: " + OuterClass.age);
 }
 }
 static class InnerStatic {
 void access() {
 System.out.println("Name: " + new OuterClass().name);
 System.out.println("Age: " + OuterClass.age);
 }
 }
}
class OuterClass {
 static int age = 19;
 String name = "Khushi Nikam";
}
