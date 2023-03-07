interface ttn2{
    String conc(String a, String b);
}
public class ques1c {
    public static void main(String[]args){
        ttn2 sc = (a,b)->{
            return a+b;
        };
        System.out.println(sc.conc("Shivam","Tyagi"));
    }
}