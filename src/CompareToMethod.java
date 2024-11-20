public class CompareToMethod {
    public static void main(String[] args) {
//        The Java String compareTo() method compares the given string with the current string. It is a method of ‘Comparable’ interface that is implemented by the String class. It either returns a positive number, a negative number, or 0.
//        if s1 > s2, it returns a positive number. if s1 < s2, it returns a negative number. if s1 == s2, it returns 0.
/**
 * Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string. The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
 */
        String s1 ="hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        String s5 = "Flag";
//        0 because both are equal
        System.out.println(s1.compareTo(s2));
//        -1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s3));
//        2 because "h" is 2 times greater than "f"
        System.out.println(s1.compareTo(s4));

        System.out.println(s5.compareTo(s4));

    }
}
