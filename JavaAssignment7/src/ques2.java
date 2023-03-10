import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ques2 {
    public static void main(String[] args)
    {
        Stream<Integer> shiv= Stream.of(1,2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> st = shiv.takeWhile(e -> (e < 3))
                .collect(Collectors.toList());
        System.out.println(st);
        Stream<Integer> sm= Stream.of(3,4,5,6,7,8,9,10);
        List<Integer> sj = sm.dropWhile(e -> (e < 6))
                .collect(Collectors.toList());
        System.out.println(sj);
    }
}
