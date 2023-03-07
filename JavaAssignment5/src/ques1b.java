interface ttn3{
    int increment(int i);
}
public class ques1b {
    public static void main(String[]args){
        int i=50;
        System.out.println("Before Increment value = "+i);
        ttn3 sc = (k)->{
            return ++k;
        };
        System.out.println("After Incremented value= "+sc.increment(i));
    }
}