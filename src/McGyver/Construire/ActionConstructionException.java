package McGyver.Construire;

public class ActionConstructionException extends RuntimeException{


    public ActionConstructionException() {
        super();
    }

    public ActionConstructionException(String message) {
        super(message);
    }

    public ActionConstructionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActionConstructionException(Throwable cause) {
        super(cause);
    }

    protected ActionConstructionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
