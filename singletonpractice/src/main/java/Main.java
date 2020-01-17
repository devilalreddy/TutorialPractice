public class Main {
    public static void main(String[] args) {
        System.out.println(Holder.getInstance());
        System.out.println(Holder.getInstance());
        System.out.println(Holder.getInstance());
        System.out.println(Holder.getInstance());


        EnumSingleTon enumSingleTon = EnumSingleTon.ENUM_SINGLE_TON;
        System.out.println(enumSingleTon.getValue());
        System.out.println(enumSingleTon.getValue());
        System.out.println(enumSingleTon.getValue());
        enumSingleTon.setValue(2);
        System.out.println(enumSingleTon.getValue());


    }
}
