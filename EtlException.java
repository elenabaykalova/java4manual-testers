package etlpac;

public class EtlException extends Exception {
    public int getUsersCount() {
        return usersCount;
    }

    private int usersCount;
    public EtlException() {
    }

    public EtlException(String message) {
        super(message);
    }

    public EtlException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtlException(Throwable cause) {
        super(cause);
    }

    public EtlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EtlException (String message, Exception cause, int usersCount){
        super(message, cause);
        this.usersCount = usersCount;

    }
}
