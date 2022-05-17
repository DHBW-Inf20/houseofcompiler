package semantic.exceptions;

public class TypeUnkown extends RuntimeException{
    public TypeUnkown(String errorMessage) {
        super(errorMessage);
    }
}
