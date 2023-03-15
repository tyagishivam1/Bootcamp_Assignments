public class ques3{
    private volatile int count = 0;
    public int Inc(){
        return count;
    }
    public void incrementCount(){
        System.out.println(count++);
    }
}
class ttn5{
    public static void main(String[]args){
        ques3 sc = new ques3();
        Thread st = new Thread(()->{
            for (int i=0;i<3;i++){
                sc.incrementCount();
            }
        });
        Thread ts = new Thread(()->{
            for (int i=0;i<3;i++){
                sc.incrementCount();
            }
        });
        System.out.println("Hello");
        st.start();
        try {
            ts.join();
        }catch (Exception e){

        }
        System.out.println("TTN");
        ts.start();
    }
}