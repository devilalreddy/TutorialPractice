package InnerClasses;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousInterfaceTesting anonymousInterfaceTesting = new AnonymousInterfaceTesting() {
            @Override
            public int getAge() {
                return  x;
            }
        };
        System.out.println(anonymousInterfaceTesting.getAge());

        //Anonymous Inner class that extending class

        Thread thread = new Thread() {
            public void run() {
                System.out.println("child thread started :");
            }
        };
        thread.start();
        System.out.println("main thread:");

        //Anonymous inner class that extending interface;

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread :: from runnable ");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
        System.out.println("Main Thread:: from runnable");

        // Anonymous inner class inside a constructor

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable constructor thread :: ");
            }
        });
    thread2.start();
        System.out.println("main thread :: after constructor thread executed");

    }
}

