package etlpac;

public class EtlFormatException extends Exception {
    public EtlFormatException(String s) {

    }

    public EtlFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtlFormatException(Throwable cause) {
        super(cause);
    }

    public EtlFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EtlFormatException() {
    }
}
