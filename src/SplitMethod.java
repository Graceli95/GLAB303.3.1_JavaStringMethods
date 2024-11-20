import java.util.Arrays;

//The split() method divides the string at the specified regex and returns an array of substrings. The syntax of the string split() method is: string.split(String regex, int limit)
public class SplitMethod {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");
//        converting array to String and printing it
        System.out.println("result = " + Arrays.toString(result));

    }
}
