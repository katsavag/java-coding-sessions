import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilter {


    //A stream filter applies a predicate to each element of the stream.
    // A predicate is a function that takes an element and returns a boolean value.
    // If the predicate returns true for an element, that element is included in the resulting stream;
    // if it returns false, the element is excluded.
    // This makes it a powerful tool for processing collections of objects based on dynamic conditions without modifying the original data structure.


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 5, 6, 4));

        List<Integer> oddNums = nums.stream().filter(num -> num % 2 > 0).toList();

        System.out.println(oddNums.toString());

    }
}
