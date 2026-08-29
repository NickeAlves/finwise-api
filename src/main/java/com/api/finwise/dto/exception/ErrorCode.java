package com.api.finwise.dto.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    ID_NOT_FOUND("ID cannot be null", HttpStatus.NOT_FOUND),
    USER_NOT_FOUND("User not found", HttpStatus.NOT_FOUND);

    private final String message;
    private final HttpStatus status;

    ErrorCode(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
