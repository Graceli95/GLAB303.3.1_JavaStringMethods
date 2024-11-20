public class IndexOfMethod {
    public static void main(String[] args) {
//        The indexOf() method returns the index of the first occurrence of the specified character/substring within the string.
        String str1 = "Java is fun";
        int result;
        // getting index of character 's'
        result = str1.indexOf("s");
        System.out.println(result);
//        getting index of character 'J'
        result = str1.lastIndexOf("J");
        System.out.println(result);
//       the last occurrence of 'a' is returned
         result = str1.lastIndexOf("a");
        System.out.println(result);

    }
}
