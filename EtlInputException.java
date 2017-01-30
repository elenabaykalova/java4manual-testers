package etlpac;

public class EtlInputException extends Exception {
    public EtlInputException() {
    }

    public EtlInputException(String message) {
        super(message);
    }

    public EtlInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtlInputException(Throwable cause) {
        super(cause);
    }

    public EtlInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
