package markerInterface.serilizable;

import java.io.*;

public class MainSerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableTest serializableTest = new SerializableTest(2, "reddy");

        FileOutputStream fileOutputStream = new FileOutputStream("testSerializable.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializableTest);

        FileInputStream fileInputStream = new FileInputStream("testSerializable.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializableTest readObject = (SerializableTest)objectInputStream.readObject();
        System.out.println("what you have:" + readObject.a + " " + readObject.b);
        objectOutputStream.close();
        objectInputStream.close();
    }
}
