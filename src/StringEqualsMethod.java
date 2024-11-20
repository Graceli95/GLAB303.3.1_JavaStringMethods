/**
 * We can compare String in Java based on content and reference.
 * It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
 * There are three ways to compare String in Java:
 * By Using equals() Method.
 * By Using == Operator.
 * By compareTo() Method.
 * The String class's equals() method compares the original content of the string. It compares the values of strings for equality. The result is printed as Boolean values, true or false.
 */

public class StringEqualsMethod {
    public static void main(String[] args) {
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        /**
         * In the above code, two strings are compared to using the equals() method of String class. The result is printed as Boolean values, true or false.
         */
    }
}
