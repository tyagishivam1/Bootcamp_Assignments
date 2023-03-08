import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class ques6a {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Date ");
        String firstDate = sc.nextLine();
        LocalDate st =LocalDate.parse(firstDate);

        System.out.println("Enter the Second Date(yyyy-MM-dd): ");
        String secondDate = sc.nextLine();
        LocalDate sn =LocalDate.parse(secondDate);

        if(st.isBefore(sn)){
            System.out.println("First Date occurs before Second Date");
        }
        else if (st.isAfter(sn)){
            System.out.println("First Date occurs after Second Date");
        }else {
            System.out.println("Both Dates are same ");
        }
    }
}