package com.project.model.exp;

public class ModelNotFoundException extends RuntimeException{
    private String message;
    private String code;

    public ModelNotFoundException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
