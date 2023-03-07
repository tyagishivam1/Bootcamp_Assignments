interface tyagi{
    boolean compare(int x, int y);
}
public class ques1a {
    public static void main(String[] args) {
        tyagi sc = (x,y)->{
            if (x<y){
                return true;
            }
            return false;
        };
        System.out.println(sc.compare(8,9));
    }
}