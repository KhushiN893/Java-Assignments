import java.util.*;
class Book {
private int isbnNumber;
private String name;
private double price;
public Book(int isbnNumber, String name, double price) {
this.isbnNumber = isbnNumber;
this.name = name;
this.price = price;
}
public int getIsbnNumber() {
return isbnNumber;
}
public String getName() {
return name;
}
public double getPrice() {
return price;
}
public String toString() {
return "ISBN No: " + isbnNumber + ", Name: " + name + ", Price: " + price;
}
}
public class Question_2 {
public static void main(String[] args) {
// Creating a list of Book objects
List<Book> bookList = new ArrayList<>();
bookList.add(new Book(1001, "CA", 12.99));
bookList.add(new Book(1002, "CN", 19.99));
bookList.add(new Book(1003, "TOC", 8.99));
bookList.add(new Book(1004, "SE", 14.99));
bookList.add(new Book(1005, "ES", 21.99));
// a. ArrayList
System.out.println("ArrayList:");
for (Book b : bookList) {
System.out.println(b);
}
// b. LinkedList
List<Book> linkedList = new LinkedList<>(bookList);
System.out.println("\nLinkedList:");
for (Book b : linkedList) {
System.out.println(b);
}
// c. ArrayDeque
Deque<Book> arrayDeque = new ArrayDeque<>(bookList);
System.out.println("\nArrayDeque:");
while (!arrayDeque.isEmpty()) {
System.out.println(arrayDeque.pop());
}
// d. PriorityQueue
Queue<Book> priorityQueue = new PriorityQueue<>(bookList.size(), 
Comparator.comparingDouble(Book::getPrice));
priorityQueue.addAll(bookList);
System.out.println("\nPriorityQueue:");
while (!priorityQueue.isEmpty()) {
System.out.println(priorityQueue.poll());
}
// e. HashSet
Set<Book> hashSet = new HashSet<>(bookList);
System.out.println("\nHashSet:");
for (Book b : hashSet) {
System.out.println(b);
}
// f. TreeSet
Set<Book> treeSet = new TreeSet<>(Comparator.comparingInt(Book::getIsbnNumber));
treeSet.addAll(bookList);
System.out.println("\nTreeSet:");
for (Book b : treeSet) {
System.out.println(b);
}
// g. HashMap
Map<Integer, Book> hashMap = new HashMap<>();
for (Book b : bookList) {
hashMap.put(b.getIsbnNumber(), b);
}
System.out.println("\nHashMap:");
for (Map.Entry<Integer, Book> entry : hashMap.entrySet()) {
System.out.println("ISBN No: " + entry.getKey() + ", Book: " + entry.getValue());
}
// h. LinkedHashMap
Map<Integer, Book> linkedHashMap = new LinkedHashMap<>();
for (Book b : bookList) {
linkedHashMap.put(b.getIsbnNumber(), b);
}
System.out.println("\nLinkedHashMap:");
for (Map.Entry<Integer, Book> entry : linkedHashMap.entrySet()) {
System.out.println("ISBN No: " + entry.getKey() + ", Book " + entry.getValue());
}
}
}