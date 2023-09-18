package org.example;

/**
 * The class `RepoCloneException` is a custom exception that extends the `RuntimeException` class and
 * takes a message as a parameter.
 */
public class RepoCloneException extends RuntimeException {
    public RepoCloneException(String message) {
        super(message);
    }
}
