interface ttn4{
    String upcase(String a);
}
public class ques1d {
    public static void main(String[]args){
        ttn4 sc = (a)->{
            return a.toUpperCase();
        };
        System.out.println(sc.upcase("Welcome to ttn"));
    }
}

