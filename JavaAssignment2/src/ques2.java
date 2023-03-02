
public class ques2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            arr[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
            finally
        {
            System.out.println("Finally Statement executed");
        }
    }
}