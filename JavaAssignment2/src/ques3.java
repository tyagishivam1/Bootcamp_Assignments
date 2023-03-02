public class ques3 {
    public static void main(String args[])
    {
        try {

            Class.forName("Shivam Tyagi");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
