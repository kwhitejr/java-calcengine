package com.kwhitejr.calcengine;

/**
 * Created by kevin on 1/17/17.
 */
public class InvalidStatementException extends Exception {
    public InvalidStatementException (String reason, String statement) {
        super(reason + ": " + statement);
    }

    public InvalidStatementException (String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }

}
