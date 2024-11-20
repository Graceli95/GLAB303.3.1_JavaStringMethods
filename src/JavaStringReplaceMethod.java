/**
 * The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
 * The syntax of the replaceAll() method is:
 *
 * string.replaceAll(String regex, String replacement)
 * regex - a regex (can be a typical string) that is to be replaced
 * replacement - matching substrings are replaced with this string
 */
public class JavaStringReplaceMethod {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

//        "java" + \\123 + "is " ???????/?/
        // regex for sequence of digits
        String regex1 = "1+";
        String regex2 = "\\d+";
        System.out.println(regex2);

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex1, " "));
        System.out.println(str1.replaceAll(regex2, " "));

    }
}
