public class ques2 {
    synchronized public void ttn() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
    static class ttn2 extends Thread {
        public void shiv() {
            synchronized (this) {
                System.out.println("Hello");
            }
        }
        ques2 sc;
        ttn2(ques2 sc) {
            this.sc = sc;
        }
        public void run() {
            sc.ttn();
        }
    }
    public static void main(String[] args) {
        ques2 obj = new ques2();
        ttn2 ts=new ttn2(obj);
        ts.shiv();
        ttn2 st = new ttn2(obj);
        ttn2 sm = new ttn2(obj);
        st.start();
        sm.start();
    }
    }

