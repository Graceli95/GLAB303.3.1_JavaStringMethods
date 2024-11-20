//The contains() method checks whether the specified string (sequence of characters) is present in the string or not.
public class ContainsMethod {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        Boolean result;
        result = str1.contains("Java");
        System.out.println(result);
        result = str1.contains("Python");
        System.out.println(result);
        result = str1.contains(" ");
        System.out.println(result);
    }

}
