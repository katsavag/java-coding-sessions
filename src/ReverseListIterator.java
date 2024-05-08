import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReverseListIterator {

    /*
    Java offers the ability to iterate in reverse on ordered collections (Arraylists).
    ListIterator interface offers hasPrevious()
     */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 5, 6, 4));

        ListIterator iterator = nums.listIterator(nums.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
