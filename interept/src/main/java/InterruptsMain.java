public class InterruptsMain {
    public static void main(String[] args) {
        Thread mainThread = new Thread(new Task());
        mainThread.start();
        System.out.println("main thread is started ");
        mainThread.interrupt();
        System.out.println("Asking politely to stop");
    }
}

