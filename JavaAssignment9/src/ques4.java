import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
class CallableExample implements Callable
{
    public Object call() throws Exception
    {
        Random generator = new Random();
        Integer sc = generator.nextInt(5);

        Thread.sleep(sc * 1000);

        return sc;
    }
}
public class ques4
{
    public static void main(String[] args) throws Exception
    {
        FutureTask[] st = new FutureTask[5];
        for (int i = 0; i < 5; i++)
        {
            Callable callable = new CallableExample();
            st[i] = new FutureTask(callable);
            Thread t = new Thread(st[i]);
            t.start();
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(st[i].get());
        }
    }
}
