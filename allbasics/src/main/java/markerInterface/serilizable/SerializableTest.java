package markerInterface.serilizable;

import java.io.Serializable;

public class SerializableTest implements Serializable {
    int a ;
    String b ;

   public  SerializableTest(int a , String b) {
        this.a = a;
        this.b = b;
    }
}
