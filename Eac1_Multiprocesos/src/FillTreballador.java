public class FillTreballador implements Runnable {
    public void run() {
        System.out.println ("Hora actual : " + System.currentTimeMillis() + "name of the thread : " + Thread.currentThread().getName() + "Starting : ");
        try {
            Thread.sleep(1000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        } System.out.println ("Hora actual : " + System.currentTimeMillis() + "name of the thread : " + Thread.currentThread().getName() + "Starting : ");
    }
}