package iit.uni.miskolc.hu.exceptions;

public class WrongHufValueExcception extends Exception {
    public WrongHufValueExcception() {
        super();
    }

    public WrongHufValueExcception(String message) {
        super(message);
    }

    public WrongHufValueExcception(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongHufValueExcception(Throwable cause) {
        super(cause);
    }

    protected WrongHufValueExcception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
