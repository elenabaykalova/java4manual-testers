package etlpac;

public class TestFailException extends Throwable {
    public TestFailException() {
    }

    public TestFailException(String message) {
        super(message);
    }

    public TestFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestFailException(Throwable cause) {
        super(cause);
    }

    public TestFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
