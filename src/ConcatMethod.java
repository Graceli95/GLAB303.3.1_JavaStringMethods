//You can also use the + operator to concatenate two or more strings. But the Java String class provides the concat() method. This method combines a specific string at the end of another string, and ultimately returns a combined string.
public class ConcatMethod {
    public static void main(String[] args) {
        String str1 = "Learn";
        String str2 = "Java";
//       by using concat method
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));
//       by using + operator
        String str3 = "hello";
        String str4 = " Learners";
        String str5 = str3 + str4;
// Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
//       String Chapter is concatenated with number 2
        String s = "Chapter" + 2;
//      String Supplement is concatenated with character B
        String s1 = "Supplement" + 'B';
    }
}
