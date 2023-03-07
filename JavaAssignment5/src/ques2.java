interface shivam{
    int methRef(int a,int b);
}
public class ques2 {
    static int multiply(int a, int b){
        return a*b;
    }
    int add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return a-b;
    }
    public static void main(String[]args){
        shivam multi = ques2::multiply;
        System.out.println("Multiple = "+multi.methRef(2,3));
        shivam sum = new ques2()::add;
        System.out.println("Sum = "+sum.methRef(2,3));
        shivam sub = new ques2()::subtract;
        System.out.println("Substraction = "+sub.methRef(7,2));
    }
}