import java.util.*;
import java.io.*;
class ques5 {
    public static class Employee {
        String Fullname;
        Long Salary;
        String City;

        Employee(String Fullname, Long Salary, String City) {
            this.Fullname = Fullname;
            this.Salary = Salary;
            this.City = City;
        }
    }

    public static List<Employee> emp() {
        return Arrays.asList(
                new Employee("Shivam Tyagi", 15000L, "Delhi"),
                new Employee("Aman Tyagi", 20000L, "Faridabad"),
                new Employee("Harsh Tyagi", 250000L, "Noida"),
                new Employee("Anshul ashu Tyagi", 3000L, "Delhi"));
    }

    public static void main(String[] args) {
        List<Employee>emp1= emp();
        emp1.stream()
                .filter(e->e.Salary<5000)
                .filter(e->e.City=="Delhi")
                .forEach(e-> System.out.println(e.Fullname.split("  ")[0]));
    }

}
