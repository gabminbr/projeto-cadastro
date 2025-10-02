package exceptions;

public class InputNaoPermitidoException extends RuntimeException {
    public InputNaoPermitidoException(String message) {
        super(message);
    }
}
