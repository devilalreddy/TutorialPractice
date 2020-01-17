package InnerClasses;

public class OuterClass implements AnonymousInterface {


    int data =50;

    public static void main(String[] args) {
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            int data = 19;
            public int getValue() {
                return data;
            }
            public int getData() {
                return data;
            }
        };

        OuterClass outerClass = new OuterClass();
        // compile time error causes because of below line
        //System.out.println(anonymousInterface.getValue(), anonymousInterface.getData(), anonymousClass.data);
    }
    @Override
    public int getValue() {
        return 0;
    }
}
