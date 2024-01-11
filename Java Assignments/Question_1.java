import java.util.*;
class Student {
private int rollNumber;
private String name;
private String gender;
public Student(int rollNumber, String name, String gender) {
this.rollNumber = rollNumber;
this.name = name;
this.gender = gender;
}
public int getRollNumber() {
return rollNumber;
}
public String getName() {
return name;
}
public String getGender() {
return gender;
}
public String toString() {
return "Roll No: " + rollNumber + ", Name: " + name + ", Gender: " + gender;
}
}
public class Question_1 {
public static void main(String[] args) {
// Creating a list of Student objects
List<Student> studentList = new ArrayList<>();
studentList.add(new Student(1, "Ishani", "Female"));
studentList.add(new Student(2, "Krish", "Male"));
studentList.add(new Student(3, "Sujay", "Male"));
studentList.add(new Student(4, "Minal", "Female"));
// ArrayList
System.out.println("List Size: " + studentList.size());
System.out.println("ArrayList:");
for (Student s : studentList) {
System.out.println(s);
}
// LinkedList
List<Student> linkedList = new LinkedList<>(studentList);
System.out.println("\nLinkedList:");
for (Student s : linkedList) {
System.out.println(s);
}
// ArrayDeque
Deque<Student> arrayDeque = new ArrayDeque<>(studentList);
System.out.println("\nArrayDeque:");
while (!arrayDeque.isEmpty()) {
System.out.println(arrayDeque.pop());
}
// PriorityQueue
Queue<Student> priorityQueue = new PriorityQueue<>(studentList.size(),
Comparator.comparingInt(Student::getRollNumber));
priorityQueue.addAll(studentList);
System.out.println("\nPriorityQueue:");
while (!priorityQueue.isEmpty()) {
System.out.println(priorityQueue.poll());
}
// HashSet
Set<Student> hashSet = new HashSet<>(studentList);
System.out.println("\nHashSet:");
for (Student s : hashSet) {
System.out.println(s);
}
// TreeSet
Set<Student> treeSet = new
TreeSet<>(Comparator.comparingInt(Student::getRollNumber));
treeSet.addAll(studentList);
System.out.println("\nTreeSet:");
for (Student s : treeSet) {
System.out.println(s);
}
// HashMap
Map<Integer, Student> hashMap = new HashMap<>();
for (Student s : studentList) {
hashMap.put(s.getRollNumber(), s);
}
System.out.println("\nHashMap:");
for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
System.out.println("Roll No: " + entry.getKey() + ", Student: " + 
entry.getValue());
}
// LinkedHashMap
Map<Integer, Student> linkedHashMap = new LinkedHashMap<>();
for (Student s : studentList) {
linkedHashMap.put(s.getRollNumber(), s);
}
System.out.println("\nLinkedHashMap:");
for (Map.Entry<Integer, Student> entry : linkedHashMap.entrySet()) {
System.out.println("Roll No: " + entry.getKey() + ", Student: " + 
entry.getValue());
}
}
}
