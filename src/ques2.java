import java.util.*;
    public class ques2 {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String abc = "";

            while(true)
            {
                String input1 = sc.nextLine();
                if(input1.equals("XDONE"))
                {
                    break;
                }
                abc += input1 + "\n";
            }
            System.out.println("Text Entered");
            System.out.println(abc);
        }
    }