interface ttn{
    void print();
}

public class ques4{
    ques4() {
        System.out.println("constructor reference");
    }

    public static void main(String[] args) {
        ttn sc = ques4 ::new;
        sc.print();
    }
}