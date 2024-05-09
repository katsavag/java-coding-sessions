import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamFromIterable {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 5, 6, 4));

        Iterable<Integer> iterator = nums;

        Stream<Integer> stream = StreamSupport.stream(iterator.spliterator(), false);

        stream
                .forEach(System.out::println);
    }
}
