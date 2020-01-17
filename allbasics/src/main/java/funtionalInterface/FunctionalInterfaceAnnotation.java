package funtionalInterface;


public class FunctionalInterfaceAnnotation {
    public static void main(String[] args) {
        int a = 10;
        FunctionalInterfaceAnnotationInterface functionalInterfaceAnnotationInterface = (int dummy)->dummy*dummy;
        int answer = functionalInterfaceAnnotationInterface.calculate(a);
        System.out.println(answer);
    }
}
