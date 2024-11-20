public class LengthMethodDemo {
//    The length() method returns the length of the string, or it returns the count of the total number of characters present in the string.
    public static void main(String[] args) {
            String str1 = "Java";
            String str2 = "";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        /**
         * The string "Java\n" consists of:
         * The characters J, a, v, a (4 characters).
         * The newline character \n (1 character).
         * Total: 5 characters.
         */
//        The \n is counted as a single character, even though it represents a newline.
//The length() method counts all characters in the string, including whitespace and escape sequences like \n, \t, etc.
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());
    }

}
