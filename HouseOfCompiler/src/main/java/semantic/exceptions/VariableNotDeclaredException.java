package semantic.exceptions;

public class VariableNotDeclaredException extends RuntimeException {
    public VariableNotDeclaredException(String errorMessage) {
        super(errorMessage);
    }
}
