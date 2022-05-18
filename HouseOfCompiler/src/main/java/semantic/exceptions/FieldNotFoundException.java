package semantic.exceptions;

public class FieldNotFoundException extends RuntimeException {
    public FieldNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
