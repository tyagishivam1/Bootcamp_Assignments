public class ques4 {
    public static class ttn3 implements Runnable {
        @Override
        public void run() {
            System.out.println("Welcome to TTN");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Hello TTN");
        }
    }
    public static class ttn4 extends Thread {
        @Override
        public void run() {
            System.out.println("Welcome to TTN");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Hello TTN");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ttn3 sc = new ttn3();
        Thread st=new Thread(sc);
        ttn4 ts= new ttn4();
        Thread us=new Thread(ts);
        st.start();
        st.join();
        us.start();
    }
}

