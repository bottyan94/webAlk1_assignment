package iit.uni.miskolc.hu.exceptions;

public class JobsListIsEmptyException extends Exception {
    public JobsListIsEmptyException() {
        super();
    }

    public JobsListIsEmptyException(String message) {
        super(message);
    }

    public JobsListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobsListIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected JobsListIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
