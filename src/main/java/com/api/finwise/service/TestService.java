package com.api.finwise.service;

import com.api.finwise.dto.exception.ErrorCode;
import com.api.finwise.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String test(String id) {
        if (id == null) {
            throw new ResourceNotFoundException(ErrorCode.ID_NOT_FOUND);
        }
        return "Yes";
    }
}
