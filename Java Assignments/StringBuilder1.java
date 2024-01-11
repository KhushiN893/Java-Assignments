public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Walchand College Sangli");
        System.out.println("1] sb.append(Information Technology) :  "+ sb.append(" Information Technology")); 
        System.out.println("2] sb.insert(7, everyone) : "+ sb.insert(8, " Engineering ")); 
        System.out.println("3] sb.replace(17, 22, Nashik) : "+ sb.replace(17, 22, "Nashik")); 
        System.out.println("4] sb.delete(21, 24) : "+  sb.delete(17, 22)); 
        System.out.println("5] sb.reverse() : "+ sb.reverse()); 
        System.out.println("6] sb.toString() : "+sb.toString());
    }
}