class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
public class ques4 {
    public static void main(String args[])
    {
        try {
            throw new MyException("Shivam Tyagi");
        }
        catch (MyException e) {
            System.out.println("Exception Catch");
            System.out.println(e.getMessage());
        }
    }
}
