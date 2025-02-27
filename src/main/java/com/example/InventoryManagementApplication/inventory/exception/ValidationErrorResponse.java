package com.example.InventoryManagementApplication.inventory.exception;


import java.util.List;

public class ValidationErrorResponse {
    private String message;
    private List<String> details;

    // Getters and setters
    // Constructor


    public ValidationErrorResponse() {
    }

    public ValidationErrorResponse(String message, List<String> details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

}
