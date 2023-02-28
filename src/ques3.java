import java.util.*;

public class ques3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******* Menu *******");
        System.out.println("1. Calculate area of a circle");
        System.out.println("2. Calculate circumference of a circle");
        System.out.println("3. Exit");

        System.out.println("Enter your choice");
        int st= sc.nextInt();

        System.out.println("Enter the radius");
        int rad = sc.nextInt();

        switch(st)
        {
            case 1:
                area(rad);
                break;
            case 2:
                circ(rad);
                break;
            case 3:
                System.out.println("Exiting...");
                break;
        }
    }
    public static void area(int rad)
    {
        System.out.println("Area of circle => " + 3.14 * rad * rad);
    }
    public static void circ(int rad)
    {
        System.out.println("Circumference of circle => " + 2 * 3.14 * rad);
    }
}
