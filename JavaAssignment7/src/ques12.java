sealed interface snacks permits biscuit,chips{
    int numberofpackets();
}
record biscuit() implements snacks {
    public int numberofpackets() {
        return 5;
    }
}
    record chips() implements snacks{
        public int numberofpackets()
        {
            return 10;
        }
    }
    public class ques12{
        public static void main(String[] args){
            chips sc=new chips();
            System.out.println(sc.numberofpackets());
            biscuit st=new biscuit();
            System.out.println(st.numberofpackets());
        }
    }