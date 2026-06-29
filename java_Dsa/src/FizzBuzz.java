import java.util.*;

public class fizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array.add("FizzBuzz");
            } else if (i % 3 == 0) {
                array.add("Fizz");
            } else if (i % 5 == 0) {
                array.add("Buzz");
            } else {
                array.add(String.valueOf(i));
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // Test case for fizzBuzz
        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }
}