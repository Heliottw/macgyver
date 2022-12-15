package McGyver.Construire;

public class RecetteException extends Exception{

    public RecetteException() {
        super();
    }

    public RecetteException(String message) {
        super(message);
    }

    public RecetteException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecetteException(Throwable cause) {
        super(cause);
    }

    protected RecetteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
