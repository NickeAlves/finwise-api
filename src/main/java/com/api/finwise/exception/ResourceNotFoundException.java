package com.api.finwise.exception;

import com.api.finwise.dto.exception.ErrorCode;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResourceNotFoundException extends RuntimeException {
    private final String errorCode;
    private final HttpStatus status;


    public ResourceNotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode.name();
        this.status = errorCode.getStatus();
    }
}
