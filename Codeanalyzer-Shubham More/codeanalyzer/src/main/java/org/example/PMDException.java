package org.example;

/**
 * The PMDException class extends the RuntimeException class and has a
 * constructor that takes a message
 * parameter.
 */
public class PMDException extends RuntimeException {
    public PMDException(String message) {
        super(message);
    }
}
