package com.api.finwise.dto.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ErrorResponseDTO {
    private int status;
    private String errorCode;
    private String message;
    private String path;
    private Instant timestamp;
}
