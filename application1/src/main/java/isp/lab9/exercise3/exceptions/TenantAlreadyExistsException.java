package isp.lab9.exercise3.exceptions;

public class TenantAlreadyExistsException extends Exception {
    public TenantAlreadyExistsException(String message) {
        super(message);
    }
}
