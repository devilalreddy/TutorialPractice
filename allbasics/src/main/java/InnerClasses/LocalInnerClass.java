package InnerClasses;

public class LocalInnerClass {
    private   int a =10;

    private static int b =20;

     final int finalVariable =10;

    public  void localInnerClassInMethod() {

        int x =0;
      //  int x = 60;
         class  PrintData {
           //  x= 50; cannot assign a new value for inner class rule
             int x = 80;

            public int add() {
                return x+b;
            }
            public int sub() {
                return x-b;
            }
        }
        PrintData printData = new PrintData();
        System.out.println(printData.add());
        System.out.println(printData.sub());
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerClassInMethod();
    }
}
