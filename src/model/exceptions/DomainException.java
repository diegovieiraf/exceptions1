package model.exceptions;

public class DomainException extends RuntimeException { //Exception obriga tratemento. RunTimeException não.
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
