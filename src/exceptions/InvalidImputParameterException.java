package exceptions;

public class InvalidImputParameterException extends RuntimeException {

    public InvalidImputParameterException() {
    }

    public InvalidImputParameterException(String message) {
        super(message);
    }

    public InvalidImputParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidImputParameterException(Throwable cause) {
        super(cause);
    }
}
