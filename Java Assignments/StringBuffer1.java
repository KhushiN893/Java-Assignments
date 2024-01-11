//String Buffer class and its method
import java.io.*; 
public class StringBuffer1 { 
public static void main(String[] args) 
{ 
StringBuffer str1 = new StringBuffer("Walchand College of Engineering"); 
System.out.println("____________________________________________________________________________________________________________________");
System.out.println("String = "+str1);
System.out.println("____________________________________________________________________________________________________________________");
System.out.println("String Buffer method ");
System.out.println("____________________________________________________________________________________________________________________");
System.out.println("1] str1.append( Sangli) = "+ str1.append(" Sangli")); 
System.out.println("2] str1.capacity() = " +str1.capacity()); 
System.out.println("3] str1.insert(23, sangli) = " + str1.insert(23,"sangli ")); 
System.out.println("4] str1.replace(23,Maharashtra) = " +str1.insert(23," Maharashtra ")); 
System.out.println("5] str1.charAt(24) = " + str1.charAt(24)); 
System.out.println("6] str1.length() = " + str1.length()); 
System.out.println("7] str1.delete(41,53) = " + str1.delete(41,53) ); 
System.out.println("8] str1.reverse() = " + str1.reverse()); 
} 
}
