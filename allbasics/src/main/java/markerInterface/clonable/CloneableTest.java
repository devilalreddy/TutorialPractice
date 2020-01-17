package markerInterface.clonable;

public class CloneableTest   implements  Cloneable{
      int a ;
     String b;

    public CloneableTest(int a , String b) {
        this.a = a;
        this.b = b;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}
