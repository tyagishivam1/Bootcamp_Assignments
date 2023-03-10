import java.util.stream.IntStream;
public class ques4 {
    public static void main(String[] args){
    IntStream
            .iterate(0,i -> i<=5, i->i+3)
            .forEach(System.out::println);
}
}
