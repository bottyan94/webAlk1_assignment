package iit.uni.miskolc.hu.exceptions;

public class HrListIsEmptyException extends Exception {
    public HrListIsEmptyException() {
        super();
    }

    public HrListIsEmptyException(String message) {
        super(message);
    }

    public HrListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public HrListIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected HrListIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
