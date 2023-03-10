import java.io.*;
public class ques8{
    public static void main(String[] args) {
        try (ttn2 d = new ttn2();
             ttn1 d1 = new ttn1()) {
            int x = 5 / 0;
            d.display();
            d1.display1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
class ttn2 implements Closeable {
    void display() { System.out.println("TTN"); }
    public void close()
    {
        System.out.println("close");
    }
}
class ttn1 implements Closeable {
    void display1()
    { System.out.println("TTN"); }
    public void close()
    {
        System.out.println("close");
    }
}