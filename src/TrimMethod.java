public class TrimMethod {
//   The Java string trim() method removes the leading and trailing spaces. It checks the Unicode value of the space character (‘\u0020’) before and after the string. If it exists, then remove the spaces and return the omitted string.
    public static void main(String[] args) {
        String s1 ="  hello  ";
//        without trim()
        System.out.println(s1 + "how are you");
//        with trim()
        System.out.println(s1.trim() + "how are you");

    }
}
