package com.example.ticketsProject.model;

public enum Role {
    USER, ADMIN;

   private String role;

    Role() {
    }

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
