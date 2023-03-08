interface ttn {
    default void ttn1() {
        System.out.println("Welcome to TTN");
    }

    static void ttn2() {
        System.out.println("Hello TTN");
    }
}
public class ques2 implements ttn {
public static void main(String[] args){
ques2 sc=new ques2();
sc.ttn1();
ttn.ttn2();
}
}
