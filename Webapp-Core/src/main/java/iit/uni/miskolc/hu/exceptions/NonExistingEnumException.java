package iit.uni.miskolc.hu.exceptions;

public class NonExistingEnumException extends Exception{
    public NonExistingEnumException() {
        super();
    }

    public NonExistingEnumException(String message) {
        super(message);
    }

    public NonExistingEnumException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonExistingEnumException(Throwable cause) {
        super(cause);
    }

    protected NonExistingEnumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
