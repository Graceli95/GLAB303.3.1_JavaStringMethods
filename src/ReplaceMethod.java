//The replace() method replaces each matching occurrence of the old character/text in the string with the new character/text.

public class ReplaceMethod {
    public static void main(String[] args) {
        /**
         * The syntax of the replace() method is either:
         * stringobj.replace(char oldChar, char newChar)
         * or
         * stringobj.replace(CharSequence oldText, CharSequence newText)
         */

        String str1 = "abc cba";
        System.out.println(str1.replace('a','z'));
        System.out.println("Lava".replace('L','j'));
        System.out.println("Hello".replace('4', 'J'));
        System.out.println(str1.replace("C++", "Java"));
        System.out.println("aa bb aa zz".replace("aa", "zz"));
        System.out.println("Java".replace("C++", "C"));

    }
}
