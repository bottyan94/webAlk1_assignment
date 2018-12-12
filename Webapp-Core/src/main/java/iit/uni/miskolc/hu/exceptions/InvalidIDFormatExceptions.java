package iit.uni.miskolc.hu.exceptions;

public class InvalidIDFormatExceptions extends Exception {
    public InvalidIDFormatExceptions() {
        super();
    }

    public InvalidIDFormatExceptions(String message) {
        super(message);
    }

    public InvalidIDFormatExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIDFormatExceptions(Throwable cause) {
        super(cause);
    }

    protected InvalidIDFormatExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
