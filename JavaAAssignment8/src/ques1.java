public class ques1 extends Thread{
     @Override
     public void run() {
          System.out.println("Welcome TO THE NEW");
          try {
               for (int i = 0; i < 3; i++) {
                    Thread.sleep(100);
                    System.out.println(i);
               }
          } catch (Exception e) {
               System.out.println(e);
          }
     }
     public static void main(String[] args) throws InterruptedException {
               ques1 sc = new ques1();
               Thread st = new Thread(sc);
               st.start();
               st.join();
               Thread sm=new Thread(st);
               sm.start();
          }
          }