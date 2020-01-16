package StaticMethodInterface;

public class Main implements StaticMethodInterfaceTest {
    public static void main(String[] args) {

        Main main = new Main();
        StaticMethodInterfaceTest.printHello();

       main.otherMethod();

    }

    @Override
    public void otherMethod() {
        System.out.println("implemented interface method ");
    }
}
