package markerInterface.clonable;

import markerInterface.clonable.CloneableTest;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableTest cloneableTest =  new CloneableTest(1, "devilal");
        CloneableTest clone = (CloneableTest) cloneableTest.clone();
        System.out.println(clone.a);
        System.out.println(clone.b);

    }
}
