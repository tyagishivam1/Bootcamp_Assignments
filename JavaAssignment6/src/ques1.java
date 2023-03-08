public class ques1 {
    public static void main(String[] args) {
        System.out.print("Consumer");
        Consumer con = ((x) -> {System.out.println("Not return type");});
        con.show(2);

        System.out.print("Predicate");
        Predicate pred = ((x, y) -> {if (x > y) return true;else return false;});
        boolean s = pred.num(5, 3);
        System.out.println(" " + s);

        System.out.print("Supplier");Supplier sup = (() -> {return 1;});
        int sc = sup.display();
        System.out.println(" " + sc);

        System.out.print("Function");
        Function func = ((m) -> {if (m != " ") return 1;else return 0;});
        int st = func.show1(" ");
        System.out.println(" " + st);

    }
}