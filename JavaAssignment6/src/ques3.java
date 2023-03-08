import java.util.*;
public class ques3 {
    public static void main(String[] args){
        List<Integer> sc=Arrays.asList(7,8,4,3,2,9,10);
        int x=sc.stream()
                .filter(y->y>5)
                .reduce(0,(sum,i)->sum+i);
        System.out.println(x);
    }
}
