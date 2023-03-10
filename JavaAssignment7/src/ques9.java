import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class ques9 {
    public static void main(String[] args) {
        List<Integer> sc = Stream.of(2, 3, 4, 5, 6, 7, 8, 9)
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(sc);
    }
}
