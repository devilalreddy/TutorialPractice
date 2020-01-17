public class Holder {

    private Holder() {

    }
    private static class ResourceHolder {
        static final Holder RESOURCE_HOLDER = new Holder();
    }

    public static Holder getInstance() {
        return ResourceHolder.RESOURCE_HOLDER;
    }
}
