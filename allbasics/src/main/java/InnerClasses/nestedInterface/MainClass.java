package InnerClasses.nestedInterface;

import InnerClasses.nestedInterface.OuterInterface;

public class MainClass implements OuterInterface , OuterInterface.InnerInterface {
    @Override
    public void oneMethod() {
        System.out.println("data ");
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.oneMethod();
    }
}
