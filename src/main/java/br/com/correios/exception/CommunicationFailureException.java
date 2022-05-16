package br.com.correios.exception;

public class CommunicationFailureException extends RuntimeException {

    public CommunicationFailureException(String message) {
        super(message);
    }

    public CommunicationFailureException(String message, Throwable cause) {
        super(message, cause);
    }
}
