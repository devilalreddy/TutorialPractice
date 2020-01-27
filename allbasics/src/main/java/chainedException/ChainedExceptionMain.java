package chainedException;

public class ChainedExceptionMain {
    public static void main(String[] args) {
        try {


            NumberFormatException exception = new NumberFormatException("Exception");
            exception.initCause(new NullPointerException());
            throw exception;
        } catch (NumberFormatException exception) {
            System.out.println(exception);
            System.out.println(exception.getCause());
        }
    }
}
