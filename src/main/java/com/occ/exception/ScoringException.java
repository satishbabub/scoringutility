package com.occ.exception;

/**
 * Custom Exception class, all the exceptions are caught and
 * throws as @{@link ScoringException} after wrapping the appropriate error message into it
 */
public class ScoringException extends Exception {
    public ScoringException(String errorMsg){
        super(errorMsg);
    }
}
