package semantic.exceptions;

public class InvalidASTException extends RuntimeException{
    public InvalidASTException(String errorMessage) {
        super(errorMessage);
    }
}