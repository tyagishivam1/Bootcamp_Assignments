import java.util.concurrent.locks.ReentrantLock;

public class ques2 {
    private static ReentrantLock lock=new ReentrantLock();
    public static class ttn3 implements Runnable {
        @Override
        public void run() {
            lock.lock();
            System.out.println("Welcome to TTN");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Hello TTN");
            lock.unlock();
        }
    }
    public static class ttn4 extends Thread {
        @Override
        public void run() {
            lock.lock();
            System.out.println("Welcome to TTN");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Hello TTN");
            lock.unlock();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ttn3 sc = new ttn3();
        Thread st=new Thread(sc);
        ttn4 ts= new ttn4();
        Thread us=new Thread(ts);
        st.start();
        // st.join();
        us.start();
    }
}

