package etlpac;

/**
 * Created by Java_6 on 30.01.2017.
 */
public class EtlLoaderException extends Exception {
    public EtlLoaderException() {
    }

    public EtlLoaderException(String message) {
        super(message);
    }

    public EtlLoaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtlLoaderException(Throwable cause) {
        super(cause);
    }

    public EtlLoaderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
