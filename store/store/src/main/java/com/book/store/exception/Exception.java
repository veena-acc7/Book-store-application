package com.book.store.exception;

public class Exception extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public Exception(String message){
        super(message);
    }

    public Exception(String message,Throwable throwable){
        super(message,throwable);
    }
}