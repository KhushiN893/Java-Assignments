//java program to practice Using String class and its methods
public class String1
{
public static void main(String [] args)
{
String str1=new String("Walchand College");
String str2=" Sangli";
System.out.println("__________________________________________________________");
System.out.println("String 1 : " +str1);
System.out.println("String 2 : " +str2);
System.out.println("__________________________________________________________");
System.out.println("STRING CLASS METHODS ");
System.out.println("__________________________________________________________");
System.out.println("1] str1.length() ="+str1.length()); 
System.out.println("2] str1.toUpperCase() = "+str1.toUpperCase()); 
System.out.println("3] str1.toLowerCase() = "+str1.toLowerCase()); 
System.out.println("4] str1.charAt(7) = "+str1.charAt(7)); 
System.out.println("5] str1.substring(11,22)= "+str1.substring(11,16)); 
System.out.println("6] str1.concat(str2) = "+str1.concat(str2)); 
System.out.println("8] str1.indexOf('C') = "+str1.indexOf('C')); 
System.out.println("9] str1.replace('College','Sangli') = "+str1.replace("College","Sangli")); 
System.out.println("10] str1.startsWith('Walchand') = "+str1.startsWith("Walchand")); 
}
}
