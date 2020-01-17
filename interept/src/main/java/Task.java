public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            if (Thread.currentThread().isInterrupted()) {
                System.out.println("interrupt called");
            return;
            }
            System.out.println("value:"+i);

        }
    }
}
