package InnerClasses;

class StaticNonStaticInner {
    private  int a= 10;
    private  int b = 20;
    private  static  int staticVariable = 40;
    static  class  StaticInnerClass {
        int c = 30;

        public int printData() {
            return staticVariable;
        }

        // access non static variable
       // public int printBValueWhichIsNonStatic() {
       //     return  b;
        //}


    }
     class NonStaticClass {

        //able to access both static and not static variables
        public int accessStaticVariable() {
            return staticVariable;
        }

        public int accessNonStaticVariable() {
            return a;
        }

    }

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println(staticInnerClass.printData());
      //  staticInnerClass.printBValueWhichIsNonStatic();
        StaticNonStaticInner staticNonStaticInner = new StaticNonStaticInner();
      NonStaticClass nonStaticClass = staticNonStaticInner.new NonStaticClass();
        System.out.println(nonStaticClass.accessNonStaticVariable());
        System.out.println(nonStaticClass.accessStaticVariable());

    }
}
