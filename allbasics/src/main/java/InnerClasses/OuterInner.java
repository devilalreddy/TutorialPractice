package InnerClasses;

public class OuterInner {
    private static int temp1 = 1;
    private static int temp2 = 2;
    private int temp3 = 3;
    private int temp4 = 4;
    private static int data = 20;
    private static  int localClass() {

        class InnerClass {
            public int data =10;
            private int getData() {
                return data;
            }

        };
        InnerClass innerClass = new InnerClass();
        return innerClass.getData();
    }

    public static class Inner {

        private  static  int temp5 = 5;

        // reffering nonstatic varaible to static context
        /*public int getSum() {
            return temp1 + temp2 + temp3 + temp4 + temp5 ;
        }*/
    }

    public static void main(String[] args) {
        OuterInner.Inner inner = new OuterInner.Inner();
       // inner.getSum();
        System.out.println(data*localClass());
    }
}
