package nestedinterface;

public class Main {
    public static void main(String[] args) {

        NestedInterface.NestedInterfaceTesting nestedInterfaceTesting;

        NestedInterfaceClass nestedInterfaceClass = new NestedInterfaceClass();
        nestedInterfaceTesting = nestedInterfaceClass;
        nestedInterfaceTesting.print();
    }
}
