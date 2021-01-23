package com.praveen.ms.employeeDetails.exception;

import com.google.gson.annotations.Expose;
import org.springframework.http.HttpStatus;

public class RestException extends RuntimeException {

    @Expose
    private HttpStatus statusCode;

    @Expose
    private String errorDescription;

    @Expose
    private String errorCode;

    @Expose
    private String internalErrorDescription;

    public RestException(HttpStatus statusCode, String errorDescription, String errorCode, String internalErrorDescription) {
        this.statusCode = statusCode;
        this.errorDescription = errorDescription;
        this.errorCode = errorCode;
        this.internalErrorDescription = internalErrorDescription;
    }
}
