package stream;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c");
        Stream<String> stringStream = strings.stream();
        Stream.builder()
                .add("a")
                .add("b")
                .add("c")
                .build();
        stringStream.map(s -> s.toUpperCase()
                     );
            }
}
