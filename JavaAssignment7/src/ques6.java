import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ques6{
    public static void main(String[] args){
List<Integer> sc=Arrays.asList(1,2,3,5,6,7,8,9,10);
    sc.stream()
            .filter(e -> e%2==0).findFirst().stream()
            .mapMulti((num,shiv)->IntStream.rangeClosed(1,10)
                .forEach(e->shiv.accept(e*num)))
            .forEach(System.out::println);
    }
}