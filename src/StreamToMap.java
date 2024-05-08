import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {

    static class User {
        int id;
        String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        int getId() {
            return id;
        }

        String getName() {
            return name;
        }
    }

    /*
    In Java, the Collectors.toMap() method provided by the Stream API is used to collect elements from a stream into a Map.
    This method is highly flexible, allowing you to specify how each key and value should be mapped from the stream elements.
    It's particularly useful for transforming a list of objects into a map where each object can be quickly accessed by a key,
     derived from one of its properties.
     */

    public static void main(String[] args) {
        List<User> users = List.of(new User(1, "Alice"), new User(2, "Bob"), new User(3, "Charlie"));

        Map<Integer, User> userMap = users.stream()
                .collect(Collectors.toMap(User::getId, user -> user));

        System.out.println(userMap);
    }
}
