import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main (String[] args) {
        System.out.println("Activar grupo de subprocesos");
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; i++) {
            Runnable worker = new FillTreballador();
            executor.execute(worker);
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.out.println("fin de subprocesos");
    }
}
