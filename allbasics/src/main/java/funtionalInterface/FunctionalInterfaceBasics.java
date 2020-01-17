package funtionalInterface;

public class FunctionalInterfaceBasics {

    public static void main(String[] args) {

    /*new Thread(new Runnable() {
        @Override
                public void run() {
            System.out.println("thread created");
        }
    }).start();*/

    // java 8 code for above

        new Thread(()->
        {
            System.out.println("thread created");
        }).start();

    }
}
